package ru.itpark.model;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UsersDao {

    @PersistenceContext(name = "ru.itpark.persistence")
    private EntityManager entityManager;

    public User find(long id) {
        User userWithId = User.builder()
                .id(id)
                .build();
        return entityManager.find(User.class, userWithId);
    }
}
