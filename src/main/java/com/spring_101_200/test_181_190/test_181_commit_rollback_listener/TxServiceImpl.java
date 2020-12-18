package com.spring_101_200.test_181_190.test_181_commit_rollback_listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("txService")
public class TxServiceImpl implements TxService {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUserRequiresNewTest1() {
        applicationEventPublisher.publishEvent(new MyTransactionEvent("我是和事务相关的事件，请事务提交后执行我~~~", 1));
        System.out.println(">>>>>>>>>>>>>>>>开始更新>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        User user1 = userService.selectById(456l);
        user1.setUsername("12323232323");
        userService.updateById(user1);
    }

}
