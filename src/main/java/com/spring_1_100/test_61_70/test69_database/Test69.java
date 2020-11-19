package com.spring_1_100.test_61_70.test69_database;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class Test69 {

    @Test
    public void testQuery() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_61_70/spring69.xml");
        UserService userService = (UserService) ac.getBean("userService");
        List<User> users = userService.getUsersByName("19884189046");
        System.out.println(JSON.toJSONString(users));
    }



    @Test
    public void springUpdate() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_61_70/spring69.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User user = new User();
        user.setUsername("19884189046");
        user.setPassword("654321");
        int a = userService.update(user);
        System.out.println(a);
    }


    @Test
    public void springQueryForObject() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring_1_100/config_61_70/spring69.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User user = userService.queryForObject("19884189046");
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void jdbcQuery() {
        Connection conn = null;
        PreparedStatement pstemt = null;
        try {
            //注册加载jdbc驱动
            Class.forName("com.mysql.jdbc.Driver");
            //打开连接
            conn = DriverManager.getConnection("jdbc:mysql://172.16.157.238:3306/pple_test?characterEncoding=utf-8", "ldd_biz", "Hello1234");
            //创建执行对象
            String sql = "select * from lz_user where username = ? ";
            pstemt = conn.prepareStatement(sql);
            pstemt.setString(1, "19884189046");
            //执行sql语句
            ResultSet rs = pstemt.executeQuery();
            //展开结果集
            while (rs.next()) {
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void jdbcUpdate() {
        Connection conn = null;
        PreparedStatement pstemt = null;
        try {
            //注册加载jdbc驱动
            Class.forName("com.mysql.jdbc.Driver");
            //打开连接
            conn = DriverManager.getConnection("jdbc:mysql://172.16.157.238:3306/pple_test?characterEncoding=utf-8", "ldd_biz", "Hello1234");
            //创建执行对象
            String sql = "update lz_user set password = ? where username = ? ";
            pstemt = conn.prepareStatement(sql);
            pstemt.setString(1, "123456");
            pstemt.setString(2,"19884189046");
            //执行sql语句
            int num = pstemt.executeUpdate();
            System.out.println(num);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
