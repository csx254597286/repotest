package com.csx.test;

import com.csx.entity.User;
import com.csx.servie.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        IUserService userService = (IUserService) ac.getBean("userServiceImpl");
        List<User> users = userService.selectAllUser();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("修改了");
    }

}
