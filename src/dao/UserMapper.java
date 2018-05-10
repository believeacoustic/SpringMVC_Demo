package dao;

import domain.User;

public interface UserMapper {
    public User selectByNameAndPwd(String uname,String pwd);
    public User selectByName(String uname);
    public boolean insertUser(User user);


}
