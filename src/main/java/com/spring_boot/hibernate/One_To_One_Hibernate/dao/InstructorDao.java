package com.spring_boot.hibernate.One_To_One_Hibernate.dao;

import com.spring_boot.hibernate.One_To_One_Hibernate.entity.Instructor;
import com.spring_boot.hibernate.One_To_One_Hibernate.entity.InstructorDetails;

public interface InstructorDao {
    public void addInstructorWithDetails(Instructor instructor);
    public Instructor findInstructorById(int id);

    public  void deleteInstructorById(int id);

    public void addInstructorDetailsWithInstructor(InstructorDetails details);

    public  InstructorDetails findInstructorDetailsById(int id);
    public  void deleteInstructorDetailsWithOutInstructor(int id);
}
