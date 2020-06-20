package com.test54;

import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSEt ");
    }
}
