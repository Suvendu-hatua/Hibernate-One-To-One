package com.spring_boot.hibernate.One_To_One_Hibernate;

import com.spring_boot.hibernate.One_To_One_Hibernate.dao.InstructorDao;
import com.spring_boot.hibernate.One_To_One_Hibernate.entity.Instructor;
import com.spring_boot.hibernate.One_To_One_Hibernate.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToOneHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneHibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(InstructorDao dao){
		return runner->{
//			createInstructorWithDetails(dao);
//			getInstructorWithDetails(dao);
//			deleteInstructorWithDetailsById(dao);
//			addInstructorDetailsWithInstructor(dao);
//			getInstructorDetailsWithInstructor(dao);
			deleteInstructorDetailsWithOutInstructor(dao);
		};
	}


	private void deleteInstructorDetailsWithOutInstructor(InstructorDao dao){
		int id=2;
		dao.deleteInstructorDetailsWithOutInstructor(2);
		System.out.println("Done!!!");
	}

	private void getInstructorDetailsWithInstructor(InstructorDao dao) {

		int id=2;
		InstructorDetails details=dao.findInstructorDetailsById(id);
		System.out.println(details);
		System.out.println(details.getInstructor());
	}

	private void addInstructorDetailsWithInstructor(InstructorDao dao){
		//Creating an instance of Instructor Details.
		InstructorDetails details=new InstructorDetails("http://www.youtube.com/sonali-samanta","Cooking and Sleeping");
		//Creating an instance of Instructor.
		Instructor instructor=new Instructor("Sonali","Samanta","samanta.sonali310@gmail.com");
		//Adding instructor to InstructorDetails.
		details.setInstructor(instructor);

		System.out.println("Saving Instructor Details ----> will automatically save Instructor Data into DB.");
		dao.addInstructorDetailsWithInstructor(details);
		System.out.println("Done!!!");
	}

	private void deleteInstructorWithDetailsById(InstructorDao dao) {
		int id=3;
		System.out.println("Deleting Instructor -----> will automatically delete Instructor Details from DB.");
		dao.deleteInstructorById(id);
		System.out.println("Done!!!");
	}

	private void getInstructorWithDetails(InstructorDao dao) {
		int id=1;
		Instructor result=dao.findInstructorById(id);
		System.out.println("################ Instructor ################");
		System.out.println(result);
		System.out.println("################ Instructor Details ###############");
		System.out.println(result.getInstructorDetails());
	}

	private void createInstructorWithDetails(InstructorDao dao) {

		//Creating an instance of Instructor.
		Instructor instructor=new Instructor("Test","Test","test.test010@gmail.com");
		//Creating an instance of Instructor Details.
		InstructorDetails details=new InstructorDetails("http://www.youtube.com/test-test","Coding and Playing Football");
		//Adding details to instructor.
		instructor.setInstructorDetails(details);

		System.out.println("Saving instructor into Database...");
		dao.addInstructorWithDetails(instructor);
		System.out.println("Done!!");

	}
}
