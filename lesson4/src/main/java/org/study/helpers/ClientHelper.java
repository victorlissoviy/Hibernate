package org.study.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.study.entity.Client;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ClientHelper {

  private final SessionFactory sessionFactory;

  ClientHelper() {
    sessionFactory = new AnnotationConfiguration()
        .configure()
        .buildSessionFactory();
  }

  public Client addClient(Client c) {
    try (Session session = sessionFactory.openSession()) {
      session.beginTransaction();
      session.persist(c);
      session.getTransaction().commit();
    }
    return c;
  }

  public Client getClientById(long id) {
    Client client;
    try (Session session = sessionFactory.openSession()) {
      client = session.get(Client.class, id);
    }
    return client;
  }

  public List<Client> getClientsList() {
    try (Session session = sessionFactory.openSession()) {
      CriteriaBuilder cb = (CriteriaBuilder) session.getCriteriaBuilder();
      CriteriaQuery<Client> cq = cb.createQuery(Client.class);
      Root<Client> rootEntity = cq.from(Client.class);
      CriteriaQuery<Client> all = cq.select(rootEntity);

      TypedQuery<Client> allQuery = (TypedQuery<Client>) session.createQuery(String.valueOf(all));
      return allQuery.getResultList();
    }
  }

}
