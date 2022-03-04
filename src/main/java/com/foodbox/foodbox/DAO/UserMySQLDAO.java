package com.foodbox.foodbox.DAO;

import com.foodbox.foodbox.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserMySQLDAO extends AbstractDAO<User> {

    @Autowired
    public UserMySQLDAO(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public User getOneById(int id) {
        return null;
    }

    public User getUserByUsername(String username) {
        return this.jdbcTemplate.queryForObject("SELECT * FROM users WHERE username = ?", (rs, id) -> {
            User user = new User();
            user.setId(rs.getInt(1));
            user.setUsername(rs.getString(2));
            user.setPassword(rs.getString(3));
            return user;
        }, username);
    }
}
