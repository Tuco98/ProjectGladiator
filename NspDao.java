package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Institute;
import com.lti.model.Scheme;
import com.lti.model.Student;

public class NspDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	
	public NspDao(){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
	}
	public void registerAnInstitute(Institute institute){
		tx.begin();
		em.merge(institute);
		tx.commit();
		System.out.println("Institute added");
	}
	public void addAScheme(Scheme scheme){
		tx.begin();
		em.merge(scheme);
		tx.commit();
		System.out.println("Scheme Added");
	}
	public void registerAStudent(Student student){
		tx.begin();
		em.merge(student);
		tx.commit();
		System.out.println("Student Added");
	}
	
	
	
}
