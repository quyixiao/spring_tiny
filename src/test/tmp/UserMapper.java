package com.admin.mapper;
/**
* <p>
* 公益口罩 服务类
* </p>
*
* @author quyixiao
* @since 2020-11-25
*/
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper extends BaseMapper<User> {


	User selectUserById(@Param("id")Long id);


	Long insertUser(User user);


	int updateUserById(User user);


	int updateCoverUserById(User user);


	int deleteUserById(@Param("id")Long id);


}