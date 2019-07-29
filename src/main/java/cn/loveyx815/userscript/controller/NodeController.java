package cn.loveyx815.userscript.controller;

import cn.loveyx815.userscript.entity.Node;
import cn.loveyx815.userscript.service.ParseService;
import cn.loveyx815.userscript.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


@RestController
public class NodeController {
    @Autowired
    private ParseService service=null;
    @RequestMapping("/parse")
    public Object parseFile(@RequestParam("path") String path){
        System.out.println(path);
        String filepath="E:\\Program Files (x86)\\Tencent\\QQRecordAdd\\626614916\\FileRecv\\apx.apx";
        List<Node> nodeList =null;
        try {
            nodeList=FileUtils.readFile(filepath);
        } catch (IOException e) {
            e.printStackTrace();
            return "500";
        }
        service.saveNode(nodeList);
        return "200";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String rootPath = request.getSession().getServletContext().getRealPath("/resources/upload");

        /**
         * 文件路径不存在则需要创建文件路径
         */
        File filePath = new File(rootPath);
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        String filename= file.getOriginalFilename();

        //最终文件名
        String path=rootPath + File.separator + filename;

        //String fileName = file.getOriginalFilename();
        //String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File( path);
        List<Node> nodeList =null;
        try {
            file.transferTo(dest);
            //LOGGER.info("上传成功");
           // return "上传成功";

            try {
                nodeList=FileUtils.readFile(path);
            } catch (IOException e) {
                e.printStackTrace();
                return "500";
            }
            catch (Exception e) {
                e.printStackTrace();
                return "文件类型暂不支持！";
            }
            service.saveNode(nodeList);
            return "解析成功！";
        } catch (IOException e) {
           // LOGGER.error(e.toString(), e);
        }
        return "上传失败！";
    }

}
