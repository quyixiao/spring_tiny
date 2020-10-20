package com.spring_1_100.test_61_70.test64_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectJTest {
    // a) execution
    //1.@Pointcut("execution(* com.spring_1_100.test_61_70.test64_2.*.*(..))")

    //2.@Pointcut("execution(public * *(..))")                                                            //任何公共方法的执行

    //3.@Pointcut("execution(* com..UserService.*())")                                                    //com 包及所有子包下UserService接口中的任何无参方法

    //4.@Pointcut("execution(* com.spring_1_100.test_61_70..*.*(..))")                                    //com.spring_1_100 包及所有子包下任何类的任何方法

    //5.@Pointcut("execution(* (!com.spring_1_100..UserService+).*(..))")                                 //非“com.spring_1_100 包及所有子包下UserService接口及子类型”的任何方法

    //6.@Pointcut("execution(* com.spring_1_100..UserService+.*())")                                      //com.spring_1_100 包及所有子包下 UserService 接口及子类型的的任何无参方法

    //7.com.spring_1_100 包及所有子包下UserService前缀类型的的以test开头的只有一个参数类型为java.util.Date的方法，
    // 注意该匹配是根据方法签名的参数类型进行匹配的，而不是根据执行时传入的参数类型决定的如定义方法：public void test(Object obj);
    // 即使执行时传入java.util.Date，也不会匹配的；
    //@Pointcut("execution(* com.spring_1_100..UserServi*.test*(java.util.Date))")

    //8.com.spring_1_100 包及所有子包下UserSe前缀类型的的任何方法，且抛出IllegalArgumentException和ArrayIndexOutOfBoundsException异常,【需要同时抛出】
    //@Pointcut("execution(* com.spring_1_100..UserServic*.test*(..) throws IllegalArgumentException)")

    //9.任何实现了com.spring_1_100包及所有子包下 UserService 接口和java.io.Serializable接口的类型的任何方法
    //@Pointcut("execution(* (com.spring_1_100..UserService+&& java.io.Serializable+).*(..))")

    //10.任何持有@java.lang.Deprecated注解的方法
    //@Pointcut("execution(@java.lang.Deprecated * *(..))")

    //11.任何持有@java.lang.Deprecated和@cn.javass..Secure注解的方法
    //@Pointcut("execution(@java.lang.Deprecated @com.spring_1_100..MyAnnotation * *(..))")

    //12.任何持有@java.lang.Deprecated或@com.spring_1_100..MyAnnotation注解的方法
    //@Pointcut("execution(@(java.lang.Deprecated || com.spring_1_100..MyAnnotation) * *(..))")

    //13. 任何返回值类型持有@cn.javass..Secure的方法
    //@Pointcut("execution((@com.spring_1_100..MyAnnotation *) *(..))")

    //14.任何定义方法的类型持有@com.spring_1_100..MyAnnotation的方法 【这个目前有问题，没有测试出来】
    //@Pointcut("execution(* (@com.spring_1_100..MyAnnotation *).*(..))")

    //15.任何签名带有两个参数的方法，且这个两个参数都被@ MyAnnotation 标记了，如public void test(@MyAnnotation String str1,@MyAnnotation String str1);
    //@Pointcut("execution(* *(@com.spring_1_100..MyAnnotation (*),@com.spring_1_100..MyAnnotation (*)))")

    //16.任何带有一个参数的方法，且该参数类型持有@com.spring_1_100..MyAnnotation；如public void getUserInfo(User user);且User类上持有@MyAnnotation注解
    //@Pointcut("execution(* *(@com.spring_1_100..MyAnnotation *))")

    //17.任何带有两个参数的方法，且这两个参数都被@com.spring_1_100..MyAnnotation标记了；且这两个参数的类型上都持有@com.spring_1_100..MyAnnotation
    //@Pointcut("execution(* *(@com.spring_1_100..MyAnnotation (@com.spring_1_100..MyAnnotation *),@com.spring_1_100..MyAnnotation (@com.spring_1_100..MyAnnotation  *)))")

    //18.任何带有一个java.util.Map参数的方法，且该参数类型是以<  cn.javass..Model, cn.javass..Model >为泛型参数；注意只匹配第一个参数为java.util.Map,不包括子类型；
    // 如public void test(HashMap<Model, Model> map, String str);将不匹配，必须使用“* *(java.util.HashMap<cn.javass..Model,cn.javass..Model>, ..)”
    // 进行匹配；而public void test(Map map, int i);也将不匹配，因为泛型参数不匹配
    //@Pointcut("execution(* *(java.util.Map<com.spring_1_100..Model, com.spring_1_100..Model>, ..))")

    //19.任何带有一个参数（类型为java.util.Collection）的方法，且该参数类型是有一个泛型参数，该泛型参数类型上持有
    // @com.spring_1_100..MyAnnotation注解；如public void test(Collection<Model> collection);Model类型上持有@com.spring_1_100..MyAnnotation
    //@Pointcut("execution(* *(java.util.Collection<@com.spring_1_100..MyAnnotation *>))")

    // b) within
    // 1.com..test64_2包及子包下的任何方法执行
    // @Pointcut("within(com..test64_2..*)")

    // 2.com..test64_2 包或所有子包下 类型及子类型的任何方法
    //@Pointcut("within(com..test64_2..UserService+)")

    //3.持有cn.javass..Secure注解的任何类型的任何方法必须是在目标对象上声明这个注解，在接口上声明的对它不起作用
    //@Pointcut("within(@com.spring_1_100..MyAnnotation *)")


    //this
    //1.当前AOP对象实现了 UserService 接口的任何方法
    @Pointcut("this(com.spring_1_100.test_61_70.test64_2.UserService)")
    public void test() {

    }

    @Before("test()")
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After("test()")
    public void afterTest() {
        System.out.println("afterTest()");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p) {
        System.out.println("before1");
        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after1");
        return o;
    }

}
