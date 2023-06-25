package com.galkin.spring.mvcdao.services;

import com.galkin.spring.mvcdao.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    void addNewUser(User user);

    void updateUser(User user, long id);

    void deleteUserById(long id);

}
