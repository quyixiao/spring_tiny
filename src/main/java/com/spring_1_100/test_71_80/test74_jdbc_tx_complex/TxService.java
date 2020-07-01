package com.spring_1_100.test_71_80.test74_jdbc_tx_complex;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
public interface  TxService {


    void updateUser ( );



    void updateUserRequiresNewTest1();




    void updateUserRequiresNewTest2();



}
