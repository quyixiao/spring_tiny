package com.spring_101_200.test_141_150.test_147_mybatis_constructorargs;


import org.apache.ibatis.annotations.*;

public interface UserMapper {


    @ConstructorArgs
    @Select("select * from lz_user where id = #{id}")
    User getUser(Long id);


}
