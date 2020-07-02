package com.spring_1_100.test_71_80.test74_jdbc_tx_complex;

public interface UserService {


    User selectById(Long id);

    void updateById(User user);

    void updateUserRequiresNew1();
    public void updateUserRequires1();


    void updateUserRequiresNew2();
    public void updateUserRequires2();

    void updateUserRequires();

    void updateUserSupports();

    void updateUserSupportsException();
    void updateUserMandatory();
    void updateUserRequire123();
    void updateUserRequiresNew33();

    void updateUserNotSupportException();

    void updateUserNotSupportException123();

    void updateUserNever();
}