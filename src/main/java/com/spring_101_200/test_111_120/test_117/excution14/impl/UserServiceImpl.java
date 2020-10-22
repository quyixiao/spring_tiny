package com.spring_101_200.test_111_120.test_117.excution14.impl;

import com.spring_101_200.test_111_120.test_117.excution14.UserService;
import com.spring_1_100.test_61_70.test64_2.MyAnnotation;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public int getAge() {
        System.out.println("getAge");
        return 0;
    }

    @Override
    public @MyAnnotation
    void getParentName() {
        System.out.println("getParentName");
    }

}




