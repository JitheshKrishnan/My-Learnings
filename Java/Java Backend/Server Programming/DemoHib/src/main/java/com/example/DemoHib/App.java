package com.example.DemoHib;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	AlienName an = new AlienName();
//    	an.setFname("Jith");
//    	an.setLname("Kris");
//    	an.setMname("P");
//    	
//        Alien shadow = new Alien();
//        shadow.setAid(101);
//        shadow.setColor("Black");
//        shadow.setAname(an);
//        
//        
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        SessionFactory sf = con.buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction tx = session.beginTransaction();
//        session.save(shadow);
////        shadow = (Alien) session.get(Alien.class, 102);
////        System.out.println(shadow);
//        tx.commit();
//        session.close();
    	
    	// Annotations and Mapping Relations:
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	
//    	Student s = new Student();
//    	s.setName("Jithu");
//    	s.setRollno(1);
//    	s.setMarks(50);
//    	s.getLaptops().add(laptop);
//    	
//    	laptop.getStudents().add(s);
//    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	SessionFactory sf = config.buildSessionFactory();
//    	Session session = sf.openSession();
//    	session.beginTransaction();
//    	
//    	session.save(laptop);
//    	session.save(s);
//    	
//    	session.getTransaction().commit();
    	
    	// Fetch EAGER LAZY
//    	Alien a1 = new Alien();
//    	a1.setAid(1);
//    	a1.setAname("Jithu");
//    	
//    	Alien a2 = new Alien();
//    	a2.setAid(2);
//    	a2.setAname("Naren");
//    	
//    	Alien a3 = new Alien();
//    	a3.setAid(3);;
//    	a3.setAname("Aslam");
//    	
//    	Laptop lap = new Laptop();
//    	lap.setLid(105);
//    	lap.setBrand("Samsung");
//    	lap.setPrice(1400);
//    	lap.setAlien(a1);
//    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
//    	SessionFactory sf = config.buildSessionFactory();
//    	Session session = sf.openSession();
//    	session.beginTransaction();
//    	
////    	session.save(lap);
////    	session.save(a1);
////    	session.save(a2);
//    	
//    	
//    	Alien a = session.get(Alien.class, 1);
//    	System.out.println(a.getAname());
////
////    	Collection<Laptop> laps = a.getLaps();
////    	for(Laptop l : laps) {
////    		System.out.println(l);
////    	}
//    	session.getTransaction().commit();
    	
    	// Hibernate Caching
    	Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	
    	Alien a1 = new Alien();
    	a1.setAid(101);
    	a1.setAname("Jithu1");
    	a1.setColor("Black");
    	
    	Alien a2 = new Alien();
    	a2.setAid(102);
    	a2.setAname("Jithu2");
    	a2.setColor("Brown");
    	
    	Alien a3 = new Alien();
    	a3.setAid(103);
    	a3.setAname("Jithu3");
    	a3.setColor("Beige");
    	
//    	session.save(a1);
    	Alien a = null;
    	a = (Alien) session1.get(Alien.class, 101);
    	System.out.println(a);
    	
    	session1.getTransaction().commit();
    	session1.close();
    	
    	Session session2 = sf.openSession();
    	session2.beginTransaction();
    	
    	a = (Alien) session2.get(Alien.class, 101);
    	System.out.println(a);
    	
    	session2.getTransaction().commit();
    	session2.close();
    }
}
