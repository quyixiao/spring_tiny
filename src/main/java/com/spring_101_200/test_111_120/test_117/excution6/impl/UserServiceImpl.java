package com.spring_101_200.test_111_120.test_117.excution6.impl;

import com.spring_101_200.test_111_120.test_117.excution6.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public void login(String userName) {
        System.out.println(userName + " 登陆");
    }


}