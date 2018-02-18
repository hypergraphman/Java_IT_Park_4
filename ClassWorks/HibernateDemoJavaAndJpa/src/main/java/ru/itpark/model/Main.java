package ru.itpark.model;

import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory =
              Persistence.createEntityManagerFactory( "ru.itpark.persistence" );

      EntityManager entityManager = entityManagerFactory.createEntityManager();

      entityManager.getTransaction().begin();
      User user = User.builder()
              .age(23)
              .citizen("Казань")
              .name("Марсель")
              .build();
      entityManager.persist(user);
      entityManager.getTransaction().commit();

      TypedQuery<User> userQuery = entityManager.createQuery("from User", User.class);
      List<User> userList = userQuery.getResultList();
      System.out.println(userList);
  }
}
