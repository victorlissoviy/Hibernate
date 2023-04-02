package org.study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.study.hibernate.entity.Animal;

public class Main {

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.setName("Maksik");
    animal.setType("Cat");
    animal.setAge(2);

    SessionFactory factory = new Configuration()
            .configure()
            .buildSessionFactory();

    Session session = factory.openSession();

    Transaction transaction = session.beginTransaction();
    session.persist(animal);
    transaction.commit();
    session.close();
  }
}
