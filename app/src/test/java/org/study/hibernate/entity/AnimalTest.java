package org.study.hibernate.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void setGetTest() {
        Animal animal = new Animal();

        animal.setAge(10);
        assertEquals(10, animal.getAge());

        animal.setId(1);
        assertEquals(1, animal.getId());

        animal.setName("Maks");
        assertEquals("Maks", animal.getName());

        animal.setType("Cat");
        assertEquals("Cat", animal.getType());
    }
}