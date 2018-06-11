package com.cosmink.models;


import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Model
public class Dao {

    @PersistenceContext(unitName = "persistence-unit-1", type = PersistenceContextType.EXTENDED)
    protected EntityManager entityManager;
}
