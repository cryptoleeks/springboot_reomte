package cn.loveyx815.userscript.dao;

import cn.loveyx815.userscript.entity.Node;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NodeDao {
    public Integer saveNode(@Param("list") List<Node> list);
}
