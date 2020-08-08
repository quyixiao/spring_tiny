package com.spring_1_100.test_91_100.test92_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test92 {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_1_100/config_91_100/spring92_annotation.xml");
        Waiter waiter = ctx.getBean(Waiter.class);
        waiter.greetTo("tom");
        waiter.serviceTo("quyixiao");
    }

    // execution() 是最常用的切点函数，其语法如下所示：
    // execution(<修饰符模式> ? <返回类型模式><方法名模式>(<参数模式>)<异常模式>?)
    // 除了返回类型模式，方法名模式和参数模式外，其他项都是可选的，与其直接讲解该方法的使用规则，还不如通过一个个具体的例子进行理解，下面
    // 我们给出各种使用execution()函数实例。
    // 通过方法签名定义切点
    // execution(public * *(..))
    // 匹配所有的目标类public方法，但不匹配SmartSeller和protected void showGoods()方法，第一个*代表返回类型，第二个*代表方法名，而
    // .. 代表任意入参的方法
    // execution(* *To(..))
    // 匹配目标类所有的以To为后缀的方法，它匹配NaiveWaiter ，和NughtWaiter的GreetTo()和ServiceTo()方法，第一个*代表返回类型
    // *To代表什么问题以To为后缀的方法。
    // 通过类包定义切点
    // 在类名模式串中，".*"表示包下的所有的类，而"..*"表示包，子孙包下的所有的类
    // execution(* com.baobaotao.*(..))
    // 匹配com.baobaotao包下的所有类的所有的方法
    // execution(* com.baobaotao..*(..))
    // 匹配com.baobaotao包，子孙包下所有的类的所有的方法，如com.baobaotaodao,com.baobaotao.service以及com.baobaotao.dao.user
    //包下的所有类的所有的方法都匹配,".."出现类名中时，后面的必须跟上"*",表示包，子孙包下的所有的类；
    // execution(* com..*.*Dao.find*(..)) 匹配包名前缀为com的任何包下类名后缀为Dao的方法，方法名必需以find为前缀
    // 如com.baobaotao.UserDao#findByUserId(),com.baobaotao.dao.ForumDao#findById()的方法都匹配切点 。
    // 通过方法入参定义切点 。
    // 切点表达式中方法入参部分比较复杂，可以使用"*"和".."通配符，其中"*"表示任意类型的参数，而".."表示任意类型的参数且参数个数不限 。
    // execution(* joke(String,int))
    // 匹配joke(String,int)方法，且joke()方法第一个入参是String，第二个入参是int，它匹配NaughtWaiter#joke(String,int)方法，如果
    // 方法中的入参类型是java.lang包下的类，可以直接使用类名，否则必需使用全限定名，如joke(java.util.List,int);
    // args() 和@args()
    // args() 函数的入参是类名，@args()函数的入参必需是注解类的类名，虽然args()允许在类名后面使用+通配符后缀，但是该通配符在此处没有
    // 定义，添加和不添加的效果都一样
    // args()
    // 该函数接受一个类名，表示目标类方法入参对象是指定包含子类，切点匹配，如下面的例子
    // args(com.baobaotao.Waiter)
    // 表示运行时入参是Waiter类型的方法，它和execution(* *(com.baobaotao.Waiter))区别在于后者是针对类方法的签名而言的，而前者是
    // 针对 运行时的入参类型而言的，如args(com.baobaotao.Waiter)既匹配于addWaiter(Waiter waiter) ，也匹配于addNaiveWaiter
    // （AniveWaiter naiveWaiter），而execution(* *(com.baobaotao.Waiter)) 只匹配于addWaiter(Waiter waiter)方法，实际上
    // 该函数接受一个注解类名，当方法的运行时入参对象标注了指定注解时，方法匹配的切点，这个切点函数的匹配规则不太容易理解，我们通过图
    // 7-4对此进行详细的讲解
    // 7.5.4 within() 通过类匹配模式串声明切点，within()函数定义的连接点针针对目标类而言，而非针对运行期对象的类型而言，这一点和execetion()
    // 是相同的，但是和execution()函数是不同的，within()所指定的连接点最小范围只能是类，而execution()所指定的连接点，可以大到包，
    // 小到方法入参，
}
