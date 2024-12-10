package com.spring_boot.hibernate.One_To_One_Hibernate.dao;

import com.spring_boot.hibernate.One_To_One_Hibernate.entity.Instructor;

public interface InstructorDao {
    public void addInstructorWithDetails(Instructor instructor);
    public Instructor findInstructorById(int id);
}
