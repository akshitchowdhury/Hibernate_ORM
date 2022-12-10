package com.driver;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


import com.source.*;


import java.util.List;

import org.hibernate.*;
public class Driver {

	
	public static void main(String[] args) {
		System.out.println("Connecting to your DB.......... ");
		
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Heroes.class).
				buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
	

		try {
			//create a student object
			System.out.println("Creating new hero object...");
			Heroes hero1 = new Heroes("Hercules", "DemiGod");
			Heroes hero2 = new Heroes("Zagreus", "QuarterGod");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("saving the teacher ..."); 
			session.save(hero1);
			session.save(hero2);
			List<Heroes> hero = session.createQuery("from Heroes").list();
			 
			
			for (Heroes protagonist : hero) {
				
				   System.out.println(hero);
			}
			
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
		
		
	}
}
