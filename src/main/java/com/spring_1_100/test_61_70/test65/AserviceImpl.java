package com.spring_1_100.test_61_70.test65;

import org.springframework.stereotype.Service;

@Service
public class AserviceImpl implements Aservice {
/*
    @Override
    public void a() {
        System.out.println("print a ");
        ((Aservice) AopContext.currentProxy()).b();
    }
*/

    @Override
    public void b() {
        System.out.println("print b ");
    }
}
