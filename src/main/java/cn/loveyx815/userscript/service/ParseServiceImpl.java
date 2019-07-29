package cn.loveyx815.userscript.service;

import cn.loveyx815.userscript.dao.NodeDao;
import cn.loveyx815.userscript.entity.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParseServiceImpl implements ParseService {
    @Autowired
    private NodeDao dao=null;
    @Override
    public Object saveNode(List<Node> nodeList) {
        return dao.saveNode(nodeList);
    }
}
