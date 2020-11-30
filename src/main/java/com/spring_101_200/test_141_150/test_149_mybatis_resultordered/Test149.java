package com.spring_101_200.test_141_150.test_149_mybatis_resultordered;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class Test149 {


    static SqlSessionFactory sqlSessionFactory = null;

    static {
        sqlSessionFactory = MyBatisUtil.getSqlSEssionFactory();
    }


    @Test
    public void testGetUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = userMapper.getUser(456l);
        Iterator<User> iterator1 = user.iterator();
        while (iterator1.hasNext()) {
            User next = iterator1.next();
            System.out.println(next);
        }
    }

}
