package com.spring_101_200.test_141_150.test_140_mybatis_usegeneratedkeys_keyproperty;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

public class Test141 {


    static SqlSessionFactory sqlSessionFactory = null;

    static {
        sqlSessionFactory = MyBatisUtil.getSqlSEssionFactory();
    }



    @Test
    public void test() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setManagerId(1l);
        user.setPassword("123456");
        user.setRealName("哈哈");
        user.setUsername("zhangsan");
        userMapper.insertUser(user);
        sqlSession.commit();
        System.out.println(JSON.toJSONString(user));

    }

}
