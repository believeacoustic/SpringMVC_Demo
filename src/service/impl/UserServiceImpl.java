package service.impl;

import dao.UserMapper;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired//类型注入
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(String uname, String pwd) {
        return userMapper.selectByNameAndPwd(uname,pwd);

    }

    @Override
    public boolean register(User user) {
        User user1=userMapper.selectByName(user.getUname());
        if (user1!=null){
//            用户名已经存在
            return false;
        }
        return userMapper.insertUser(user);
    }
}
