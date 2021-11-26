package com.lowes.scpjavaexamples.sqlinjection.parameterizedqueries.mitigation;

import com.lowes.scpjavaexamples.sqlinjection.parameterizedqueries.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class SqlInjectionMitigation {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User loginUser(String userName, String userPassword) {
        try {
           return jdbcTemplate.queryForObject("SELECT * FROM users WHERE userName=? AND userPassword=?",
                    BeanPropertyRowMapper.newInstance(User.class), userName, userPassword);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }
}
