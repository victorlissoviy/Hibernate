package org.study.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Animal {

  @Id
  private int id;
  private String name;
  private String type;
  private int age;

  public Animal() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
