package com.spring_101_200.test_181_190.test_186_spring_mvc_async;

import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.async.CallableProcessingInterceptor;

import java.util.concurrent.Callable;

public class MyCallableProcessingInterceptor implements CallableProcessingInterceptor {
    @Override
    public <T> void beforeConcurrentHandling(NativeWebRequest request, Callable<T> task) throws Exception {
        System.out.println("+++++++++++++++beforeConcurrentHandling+++++++++++++++++++++");
    }

    @Override
    public <T> void preProcess(NativeWebRequest request, Callable<T> task) throws Exception {
        System.out.println("+++++++++++++++preProcess+++++++++++++++++++++");
    }

    @Override
    public <T> void postProcess(NativeWebRequest request, Callable<T> task, Object concurrentResult) throws Exception {
        System.out.println("+++++++++++++++postProcess+++++++++++++++++++++");
    }

    @Override
    public <T> Object handleTimeout(NativeWebRequest request, Callable<T> task) throws Exception {
        System.out.println("+++++++++++++++handleTimeout+++++++++++++++++++++");
        return null;
    }

    @Override
    public <T> void afterCompletion(NativeWebRequest request, Callable<T> task) throws Exception {
        System.out.println("+++++++++++++++afterCompletion+++++++++++++++++++++");
    }
}
