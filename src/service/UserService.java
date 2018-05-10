package service;

import domain.User;

public interface UserService {
    public User login(String uname,String pwd);
    public boolean register(User user);
}
