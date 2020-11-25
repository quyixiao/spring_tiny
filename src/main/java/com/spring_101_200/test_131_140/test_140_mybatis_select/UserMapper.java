package com.spring_101_200.test_131_140.test_140_mybatis_select;

import org.apache.ibatis.annotations.*;

public interface UserMapper {

    void insertUser(User user);

    User getUser(Long id);



    @Select("select * from lz_user where id=#{id}")
    User getUserInfo(Long id);
}
