package com.spring_101_200.test_111_120.test_111_cglib_proxy;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallbacks(new Callback[]{this});
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before 我是媒婆，我要给你找对象，现在已经确认了你的要求，你觉得怎样");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("end 如果你觉得好，那就办事了");
        return obj;
    }


}
