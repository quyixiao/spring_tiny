package com.spring_101_200.test_151_160.test_155_tx_requires_new_requires_new_exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;


@Service
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    @Override
    public User selectById(Long id) {
        return (User) jdbcTemplate.queryForObject("select * from lz_user where id = ? ",
                new Object[]{id}, new UserRowMapper());
    }

    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void updateById(User user) {
        jdbcTemplate.update("update lz_user set username = ? where id = ? ",
                new Object[]{user.getUsername(), user.getId()});
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUserRequiresNew1() {
        User user2 = selectById(457l);
        user2.setUsername("456");
        updateById(user2);
        int i = 0;
        int j = 0;
        int c = i / j;
    }


}
