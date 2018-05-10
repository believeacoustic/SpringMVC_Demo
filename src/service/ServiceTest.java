package service;

import domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UserService service=(UserService) applicationContext.getBean("userService");
//        System.out.println(service.login("user","123"));
        System.out.println(service.register(new User("rong","123")));
    }

}
