package com.spring_101_200.test_111_120.test_117.excution10.impl;

import com.spring_101_200.test_111_120.test_117.excution10.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserServiceImpl implements UserService{

    @Override
    public void testIllegalArgumentException()  {
        System.out.println("testIllegalArgumentException ");
    }

    @Override
    @Deprecated
    public void testDeprecated() {
        System.out.println("testDeprecated ");
    }


}




