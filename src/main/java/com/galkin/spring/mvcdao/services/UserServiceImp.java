package com.galkin.spring.mvcdao.services;

import com.galkin.spring.mvcdao.dao.UserDAO;
import com.galkin.spring.mvcdao.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }
    @Transactional
    public void addNewUser(User user) {
        userDAO.addNewUser(user);
    }
    @Transactional
    public void updateUser(User user, long id) {
        userDAO.updateUser(user, id);
    }
    @Transactional
    public void deleteUserById(long id) {
        userDAO.deleteUserById(id);
    }

}
