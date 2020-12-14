package com.api.business.service;
/**
* <p>
* 公益口罩 服务类
* </p>
*
* @author quyixiao
* @since 2020-12-10
*/
public interface UserBillService extends IService<UserBill> {



	UserBill selectUserBillById(Long id);


	Long insertUserBill(UserBill userBill);


	int updateUserBillById(UserBill userBill);


	int updateCoverUserBillById(UserBill userBill);


	int deleteUserBillById(Long id);


}