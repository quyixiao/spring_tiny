package com.admin.mapper;
/**
* <p>
* 公益口罩 服务类
* </p>
*
* @author quyixiao
* @since 2020-12-21
*/
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserBillMapper extends BaseMapper<UserBill> {


	UserBill selectUserBillById(@Param("id")Long id);


	Long insertUserBill(UserBill userBill);


	int updateUserBillById(UserBill userBill);


	int updateCoverUserBillById(UserBill userBill);


	int deleteUserBillById(@Param("id")Long id);


}