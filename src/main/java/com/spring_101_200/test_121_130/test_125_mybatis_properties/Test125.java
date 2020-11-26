package com.spring_101_200.test_121_130.test_125_mybatis_properties;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;

public class Test125 {


    static SqlSessionFactory sqlSessionFactory = null;

    static {
        sqlSessionFactory = MyBatisUtil.getSqlSEssionFactory();
    }


    @Test
    public void testGetUser() throws Exception {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUser(456l);
        System.out.println(JSON.toJSONString(user));

    }


    public static SqlSessionFactory getSqlSessionFactory() {
        //构建数据库连接池
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://172.16.157.238:3306/pple_test?characterEncoding=utf-8");
        dataSource.setUsername("ldd_biz");
        dataSource.setPassword("Hello1234");
        //构建数据库事务处理方式
        TransactionFactory txFactory = new JdbcTransactionFactory();
        //创建数据库运行环境
        Environment environment = new Environment("development", txFactory, dataSource);
        //构建Configuration 对象
        Configuration configuration = new Configuration(environment);
        //注册一个 MyBatis上下文别名
        configuration.getTypeAliasRegistry().registerAlias("User", User.class);
        //加入一个映射器
        configuration.addMapper(UserMapper.class);
        //使用 SqlSessionFactoryBuilder 构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        return sqlSessionFactory;
    }

    @Test
    public void test1() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println("=================================");
        User user = userMapper.getUser(456l);
        System.out.println(JSON.toJSONString(user));
    }

    public static SqlSessionFactory getSqlSessionFactoryNew() {
        TransactionFactory txFactory = new JdbcTransactionFactory();
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://172.16.157.238:3306/pple_test?characterEncoding=utf-8");
        dataSource.setUsername("ldd_biz");
        dataSource.setPassword("Hello1234");
        Environment.Builder environmentBuilder = new Environment.Builder("development")
                .transactionFactory(txFactory)
                .dataSource(dataSource);
        //构建Configuration 对象
        Configuration configuration = new Configuration();
        configuration.setEnvironment(environmentBuilder.build());
        //注册一个 MyBatis上下文别名
        configuration.getTypeAliasRegistry().registerAlias("User", User.class);
        //加入一个映射器
        configuration.addMapper(UserMapper.class);
        //使用 SqlSessionFactoryBuilder 构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        return sqlSessionFactory;
    }


}
