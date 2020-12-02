package com.spring_101_200.test_141_150.test_145_mybatis_cachenamespaceref_xml;


import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    User getUser(@Param("id") Long id);

    User getUserByParameterMap(User user);
}
