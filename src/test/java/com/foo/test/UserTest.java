package com.foo.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.foo.entity.User;
import com.foo.service.UserService;

public class UserTest {

    private UserService userService;

    @Before
    public void before() {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:config/spring.xml",
                        "classpath:config/spring-mybatis.xml" });
        userService = (UserService) context.getBean("userServiceImpl");
    }

//    @Test
//    public void addUser() {
//        User user = new User();
//        user.setUsername("charles");
//        user.setPassword("welcome123");
//        user.setLocked(true);
//        System.out.println("addUser: " + userService.addUser(user));
//    }
    
    @Test
    public void updateUser() {
        User user = new User();
        user.setUsername("charles");
        user.setPassword("你好");
        user.setLocked(false);
        System.out.println("updateUser: " + userService.updateUser(user));
    }
    
    @Test
    public void getUser() {
        User user = new User();
        user.setUsername("charles");
        System.out.println("getUser: " + userService.getUser(user));
    }

//    @Test
//    public void deleteUser() {
//        User user = new User();
//        user.setUsername("charles");
//        user.setPassword("welcome1234");
//        user.setLocked(false);
//        System.out.println("deleteUser: " + userService.deleteUser(user));
//    }
}