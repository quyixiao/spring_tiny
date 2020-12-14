package com.admin.service.impl;
/**
* <p>
* 公益口罩 服务类
* </p>
*
* @author quyixiao
* @since 2020-12-10
*/

@Service
public class UserBillServiceImpl extends ServiceImpl<UserBillMapper, UserBill> implements UserBillService {


    @Autowired
	private UserBillMapper userBillMapper;



	@Override
	public UserBill selectUserBillById(Long id){
		return userBillMapper.selectUserBillById(id);
	}



	@Override
	public Long insertUserBill(UserBill userBill){
		return userBillMapper.insertUserBill(userBill);
	}



	@Override
	public int updateUserBillById(UserBill userBill){
		return userBillMapper.updateUserBillById(userBill);
	}



	@Override
	public int updateCoverUserBillById(UserBill userBill){
		return userBillMapper.updateCoverUserBillById(userBill);
	}



	@Override
	public int deleteUserBillById(Long id){
		return userBillMapper.deleteUserBillById(id);
	}



}
