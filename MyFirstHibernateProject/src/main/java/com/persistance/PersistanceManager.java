package com.persistance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Student;

public class PersistanceManager {


	
	public static void main(String[] args) 
	{
	
		Configuration cfg = new Configuration().configure();
		SessionFactory factory =cfg.buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tr =ses.beginTransaction();
		
		//Session ses = new Configuration().configure("").buildSessionFactory().openSession();
	
		Student s1= new Student (115,"Shakuntala");
		
 		ses.persist(s1);
  		System.out.println("....Data Inserted.....");
		
		
		
		//Get Data
 		Student s2=ses.get(Student.class,new Integer(115));
    	System.out.println("Student data is :"+s2.getsName());
		
		//update
		Student s3=ses.get(Student.class,new Integer(111));
		s3.setsName("Kavita");
    	ses.update(s3);
    	System.out.println("Student name update is..... :"+s3.getsName());
	
		
		
		//Delete
     	Student s4=ses.get(Student.class,new Integer(113));
        ses.delete(s4);
     	System.out.println("Data deleted...");
		
		
		tr.commit();
		ses.close();
			
	}

}






