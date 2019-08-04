package cn.loveyx815.userscript.service;

import cn.loveyx815.userscript.entity.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    User getUser(long id);
    User insertUser(User user);
}
