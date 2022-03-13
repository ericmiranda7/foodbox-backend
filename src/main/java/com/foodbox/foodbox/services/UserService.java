package com.foodbox.foodbox.services;

import com.foodbox.foodbox.DAO.DAO;
import com.foodbox.foodbox.DAO.UserMySQLDAO;
import com.foodbox.foodbox.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final DAO<User> userDAO;

    @Autowired
    public UserService(UserMySQLDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User getUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;
        try {
            user = ((UserMySQLDAO) userDAO).getUserByUsername(username);
        } catch (Exception DataAccessException) {
            System.out.println("Throwing");
            throw new UsernameNotFoundException("No such username");
        }
        return user;
    }
}
