package com.spring_101_200.test_141_150.test_148_mybatis_selectprovider;


import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


    @Select("select * from lz_user where id = #{id}")
    User getUser(Integer id);


}
