package com.spring_101_200.test_151_160.test_155_tx_requires_new_requires_new_exception;

public interface UserService {


    User selectById(Long id);

    void updateById(User user);

    void updateUserRequiresNew1();

}