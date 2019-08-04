package cn.loveyx815.userscript.service;

import cn.loveyx815.userscript.dao.UserDao;
import cn.loveyx815.userscript.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao dao=null;
    //获取ID，取参数ID缓存用户
    @Override
    @Transactional
    @Cacheable(value = " redisCache",key = "'redis_user_'+#id")
    public User getUser(long id) {
         return dao.getUser(id);
    }
    //插入用户，mybatis会回填ID，取结果ID缓存用户
    @Override
    @Transactional
    @CachePut(value = " redisCache",key = "'redis_user_'+#result.id")
    public User insertUser(User user) {
        dao.insertUser(user);
        return user;
    }
}
