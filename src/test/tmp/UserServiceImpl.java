package com.admin.service.impl;
/**
* <p>
* 公益口罩 服务类
* </p>
*
* @author quyixiao
* @since 2020-11-25
*/

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
	private UserMapper userMapper;



	@Override
	public User selectUserById(Long id){
		return userMapper.selectUserById(id);
	}



	@Override
	public Long insertUser(User user){
		return userMapper.insertUser(user);
	}



	@Override
	public int updateUserById(User user){
		return userMapper.updateUserById(user);
	}



	@Override
	public int updateCoverUserById(User user){
		return userMapper.updateCoverUserById(user);
	}



	@Override
	public int deleteUserById(Long id){
		return userMapper.deleteUserById(id);
	}



}
