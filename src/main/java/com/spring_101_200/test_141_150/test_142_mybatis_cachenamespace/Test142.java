package com.spring_101_200.test_141_150.test_142_mybatis_cachenamespace;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class Test142 {


    static SqlSessionFactory sqlSessionFactory = null;

    static {
        sqlSessionFactory = MyBatisUtil.getSqlSEssionFactory();
    }

    @Test
    public void test() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUser(456l);
        sqlSession.commit();
        System.out.println("======================");
        user = userMapper.getUser(456l);
        System.out.println(JSON.toJSONString(user));
    }

}
