package com.spring_1_100.test_71_80.test74_jdbc_tx_complex;

public interface UserService {


    User selectById(Long id);

    void updateById(User user);

    void updateUserRequiresNew1();


    void updateUserRequiresNew2();


}