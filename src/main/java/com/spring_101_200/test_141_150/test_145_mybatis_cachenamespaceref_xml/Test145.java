package com.spring_101_200.test_141_150.test_145_mybatis_cachenamespaceref_xml;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonGenerator;
import org.apache.ibatis.builder.IncompleteElementException;
import org.apache.ibatis.builder.ResultMapResolver;
import org.apache.ibatis.builder.xml.XMLIncludeTransformer;
import org.apache.ibatis.builder.xml.XMLStatementBuilder;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.keygen.Jdbc3KeyGenerator;
import org.apache.ibatis.executor.keygen.KeyGenerator;
import org.apache.ibatis.executor.keygen.NoKeyGenerator;
import org.apache.ibatis.executor.keygen.SelectKeyGenerator;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.scripting.LanguageDriver;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.junit.Test;

import java.util.*;

public class Test145 {


    static SqlSessionFactory sqlSessionFactory = null;

    static {
        sqlSessionFactory = MyBatisUtil.getSqlSEssionFactory();
    }


    @Test
public void test1() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    UserBillMapper userBillMapper = sqlSession.getMapper(UserBillMapper.class);
    System.out.println("首次通过userMapper查询用户信息：");
    User user = userMapper.getUser(456l);
    System.out.println("user:" + JSON.toJSONString(user));
    sqlSession.commit();
    System.out.println("第二次通过userMapper查询用户信息：");
    user = userMapper.getUser(456l);
    System.out.println("第三次通过userBillMapper查询用户信息：");
    User user2 = userBillMapper.getUser(456l);
    System.out.println("user2:"+JSON.toJSONString(user2));
}




    @Test
    public void test2() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User param = new User();
        param.setPassword("123456aaaaa");
        User user = userMapper.getUserByParameterMap(param);
        System.out.println(JSON.toJSONString(user));

    }








}
