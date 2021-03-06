package com.spring_101_200.test_161_170.test_170_tx_out_required_inner_mandatory;

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

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUserRequire123() {
        User user1 = selectById(456l);
        user1.setUsername("123");
        updateById(user1);
    }



    @Transactional(propagation = Propagation.MANDATORY)
    public void updateUserMandatory(){
        User user2 = selectById(457l);
        user2.setUsername("456");
        updateById(user2);
    }



}
