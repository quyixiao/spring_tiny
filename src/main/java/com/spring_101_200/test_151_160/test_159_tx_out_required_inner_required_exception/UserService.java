package com.spring_101_200.test_151_160.test_159_tx_out_required_inner_required_exception;

public interface UserService {


    User selectById(Long id);

    void updateById(User user);


    void updateUserRequires1();
}