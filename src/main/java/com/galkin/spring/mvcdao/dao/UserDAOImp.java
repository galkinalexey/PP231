package com.galkin.spring.mvcdao.dao;

import com.galkin.spring.mvcdao.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User").getResultList();
    }
    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void addNewUser(User user) {
        entityManager.persist(user);
    }
    @Override
    public void updateUser(User updateUser, long id) {
        entityManager.merge(updateUser);
        entityManager.flush();

    }
    @Override
    public void deleteUserById(long id) {
        entityManager.remove(getUserById(id));
    }


}
