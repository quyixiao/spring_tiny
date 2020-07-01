package com.spring_1_100.test_71_80.test74_jdbc_tx_complex;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class TxServiceImpl implements TxService {

    private UserService userService;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser() {


        User user1 = userService.selectById(456l);
        user1.setUsername("123");
        userService.updateById(user1);
        int i = 0 ;
        int j = 0;
        int c = i / j ;

        User user2 = userService.selectById(457l);
        user2.setUsername("456");
        userService.updateById(user2);
    }




    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUserRequiresNewTest1(){
        User user1 = userService.selectById(456l);
        user1.setUsername("123");
        userService.updateById(user1);
        userService.updateUserRequiresNew1();
    }






    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUserRequiresNewTest2(){
        User user1 = userService.selectById(456l);
        user1.setUsername("123");
        userService.updateById(user1);
        userService.updateUserRequiresNew2();
        int i = 0 ;
        int j = 0;
        int c = i / j ;
    }




    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
