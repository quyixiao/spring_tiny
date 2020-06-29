package com.spring_1_100.test_61_70.test69_database;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;


    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("INSERT INTO lz_user (username, password, real_name, manager_id) VALUES ( ?, ?, ?, ?) ",
                new Object[]{user.getUsername(), user.getPassword(), user.getRealName(), user.getManagerId()});

    }

    @Override
    public List<User> getUsers() {
        return jdbcTemplate.query("select * from lz_user ", new UserRowMapper());
    }
}
