package com.example.demo.models.dao;

import com.example.demo.models.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDao implements IUserDao{

    @PersistenceContext
    EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return em.createQuery("from User").getResultList();
    }
}
