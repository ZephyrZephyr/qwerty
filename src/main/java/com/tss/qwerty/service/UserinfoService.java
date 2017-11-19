package com.tss.qwerty.service;

import com.tss.qwerty.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserinfoService {

    public static final int ID_SIZE = 10;
    public static final String ID_MARK_STUDENT = "st";
    public static final String ID_MARK_TEACHER = "te";
    public static final String ID_MARK_ADMIN = "ad";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void initUser(){

        String sql = "create table if not exists user(id varchar("+ID_SIZE+")," +
                "                                      email varchar(255) not null," +
                "                                      password varchar(255) not null," +
                "                                      name varchar(255) not null," +
                "                                      type varchar(255) not null," +
                "                                      primary key(id))default charset=utf8;";
        jdbcTemplate.execute(sql);

        logger.info("success init!");
    }
    public User getUser(String email){
        initUser();
        String sql = "select * from user where email = ?;";
        return (User) jdbcTemplate.queryForObject(sql,
                new Object[]{email},
                new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user  = new User();
                        user.setId(rs.getString("id"));
                        user.setEmail(rs.getString("email"));
                        user.setName(rs.getString("name"));
                        user.setPassword(rs.getString("password"));
                        user.setType(rs.getString("type"));
                        return user;
                    }
                }
        );

    }
   /* public UserinfoService(){
        logger.info("user info service");
        initUser();
    }*/
}
