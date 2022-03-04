package com.foodbox.foodbox.services;

import com.foodbox.foodbox.DAO.DAO;
import com.foodbox.foodbox.DAO.UserMySQLDAO;
import com.foodbox.foodbox.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final DAO<User> userDAO;

    @Autowired
    public UserService(UserMySQLDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User getUserByUsername(String username) {
        User user = ((UserMySQLDAO) userDAO).getUserByUsername(username);
        return user;
    }
}
