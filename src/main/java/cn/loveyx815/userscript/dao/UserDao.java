package cn.loveyx815.userscript.dao;

import cn.loveyx815.userscript.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import sun.rmi.runtime.Log;

import java.util.List;
@Repository
public interface UserDao {
    User getUser(Long id);
    int insertUser(User user);
    int updateUser(User user);
    List<User> findUsers(@Param("userName") String userName,
                         @Param("note") String note);
    int deleteUser(Long id);
}
