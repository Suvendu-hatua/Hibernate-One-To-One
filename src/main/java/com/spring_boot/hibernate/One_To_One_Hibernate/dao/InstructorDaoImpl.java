package com.spring_boot.hibernate.One_To_One_Hibernate.dao;

import com.spring_boot.hibernate.One_To_One_Hibernate.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorDaoImpl implements InstructorDao{
    private EntityManager entityManager;

    @Autowired
    public InstructorDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public void addInstructorWithDetails(Instructor instructor) {

    }

    @Override
    public Instructor findInstructorById(int id) {
        return null;
    }
}
