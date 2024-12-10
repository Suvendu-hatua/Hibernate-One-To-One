package com.spring_boot.hibernate.One_To_One_Hibernate.dao;

import com.spring_boot.hibernate.One_To_One_Hibernate.entity.Instructor;
import com.spring_boot.hibernate.One_To_One_Hibernate.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class InstructorDaoImpl implements InstructorDao{
    private EntityManager entityManager;

    @Autowired
    public InstructorDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void addInstructorWithDetails(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class,id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor instructor=findInstructorById(id);
        entityManager.remove(instructor);
    }

    @Override
    @Transactional
    public void addInstructorDetailsWithInstructor(InstructorDetails details) {
        entityManager.persist(details);
    }

    @Override
    public InstructorDetails findInstructorDetailsById(int id) {
        return entityManager.find(InstructorDetails.class,id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailsWithOutInstructor(int id) {
        InstructorDetails details=findInstructorDetailsById(id);
        details.getInstructor().setInstructorDetails(null);
        entityManager.remove(details);
    }
}
