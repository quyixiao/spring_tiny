package com.test43;

import org.springframework.context.ApplicationContext;

public abstract class GetBeanTest {
    public void showMe() {
        this.getBean().showMe();
    }
    public abstract Teacher getBean();
}

