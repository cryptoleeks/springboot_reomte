package cn.loveyx815.userscript.utils;

import cn.loveyx815.userscript.entity.Node;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> split(String str, char c) {
        List<String> strList = new ArrayList<>();
        int start = 0;
        int i=0;
        for ( ; i < str.length(); ) {
            char sc = str.charAt(i);
            if (c == sc) {
                if (start < i) {
                    //System.out.println("添加的元素为：" + str.substring(start, i));
                    strList.add(str.substring(start, i));
                }
                start = ++i;
            } else {
                i++;
            }
        }
        strList.add(str.substring(start, i));
        // System.out.println(strList.toString());
        return strList;
    }



    public static List<Node> readFile(String path) throws IOException {
        List<Node> nodelist=new ArrayList<>();
        File myFile=new File(path);
        // 以行为单位读取文件，常用于读面向行的格式化文件
        BufferedReader reader = null;
        Node node=null;
        String pnodename=null;
        String snodename=null;
        try {
            reader = new BufferedReader(new FileReader(myFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String tempString = null;
        int line = 1;
        // 一次读入一行，直到读入null为文件结束
        while ((tempString = reader.readLine()) != null) {

            node=new Node();
            if (tempString.contains("arg")){
                pnodename = split((split(tempString,'(').get(1)),')').get(0);
                //snodename = (tempString.split(",")[1]).split(")")[0];
            }
            else {
                pnodename = (tempString.split(",")[0]).substring(4);
                snodename = split((tempString.split(",")[1]),')').get(0);
            }

            node.setPnode(pnodename);
            node.setSnode(snodename);
            nodelist.add(node);
            // 显示行号
            System.out.println("line " + line + ": " + tempString);
            line++;
        }
        reader.close();
        return nodelist;

// 常用BufferedReader

    }

   /* public static void main(String[] args) {
        String filepath="E:\\Program Files (x86)\\Tencent\\QQRecordAdd\\626614916\\FileRecv\\apx.apx";
        try {
            readFile(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
