package com.spring_1_100.test_71_80.test74_jdbc_tx_complex;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;


    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public User selectById(Long id) {
        return (User) jdbcTemplate.queryForObject("select * from lz_user where id = ? ",
                new Object[]{id}, new UserRowMapper());
    }

    @Override
    public void updateById(User user) {
        jdbcTemplate.update("update lz_user set username = ? where id = ? ",
                new Object[]{user.getUsername(), user.getId()});
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUserRequiresNew1(){
        User user2 = selectById(457l);
        user2.setUsername("456");
        updateById(user2);
        int i = 0 ;
        int j = 0;
        int c = i / j ;
    }




    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUserRequiresNew2(){
        User user2 = selectById(457l);
        user2.setUsername("456");
        updateById(user2);
    }



}
