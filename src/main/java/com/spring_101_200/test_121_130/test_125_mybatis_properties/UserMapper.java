package com.spring_101_200.test_121_130.test_125_mybatis_properties;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.ResultHandler;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    void insertUser(User user);

    User getUser(Long id);

    List<User> getUserList(@Param("id") long id);

    @MapKey("username")
    Map getUserByMap(@Param("id") long id);

    void getUserByResultHandler(@Param("id") long id, ResultHandler resultHandler);
}
