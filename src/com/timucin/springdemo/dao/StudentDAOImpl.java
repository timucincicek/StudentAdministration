package com.timucin.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.timucin.springdemo.entity.Student;
@Repository//If we try to fetch data from somewhere (DataAccsessObjects)

public class StudentDAOImpl implements StudentDAO {
    @Autowired //Object created from SessionFactory(Dependency Injection)
	
    private SessionFactory sessionFactory; //Required for Hibernate Session
    
    @Override 	
    public List<Student> getStudents() {
    	Session currentSession = sessionFactory.getCurrentSession(); //Trying to get session
    	Query<Student> theQuery = currentSession.createQuery("from Student",Student.class); //SELECT*FROM query
		List<Student> students=theQuery.getResultList(); // takes all list and adds into students
    	return students;
	}
	@Override
	public void saveStudent(Student theStudent) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theStudent);
	}
	@Override
	public Student getStudent(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student theStudent = currentSession.get(Student.class,theId); //student id fetched
		return theStudent;
        
	}
	@Override
	public void deleteStudent(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery = currentSession.createQuery("delete from Student where id=:studentId");
        theQuery.setParameter("studentId", theId);
        theQuery.executeUpdate();
	}

}
