package com.api.business.service;
/**
* <p>
* 公益口罩 服务类
* </p>
*
* @author quyixiao
* @since 2020-11-25
*/
public interface UserService extends IService<User> {



	User selectUserById(Long id);


	Long insertUser(User user);


	int updateUserById(User user);


	int updateCoverUserById(User user);


	int deleteUserById(Long id);


}