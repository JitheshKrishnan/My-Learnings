package com.example.DemoHibCache;

import java.util.Random;

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
    	// Hibernate Caching
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
//    	SessionFactory sf = config.buildSessionFactory();
//    	Session session1 = sf.openSession();
//    	session1.beginTransaction();
//    	
//    	Alien a1 = new Alien();
//    	a1.setAid(101);
//    	a1.setAname("Jithu1");
//    	a1.setColor("Black");
//    	
//    	Alien a2 = new Alien();
//    	a2.setAid(102);
//    	a2.setAname("Jithu2");
//    	a2.setColor("Brown");
//    	
//    	Alien a3 = new Alien();
//    	a3.setAid(103);
//    	a3.setAname("Jithu3");
//    	a3.setColor("Beige");
//    	
////    	session1.save(a2);
////    	session1.save(a3);
//    	Alien a = null;
////    	a = (Alien) session1.get(Alien.class, 101);
//    	
//    	Query q1 = session1.createQuery("FROM Alien WHERE aid=101");
//    	q1.setCacheable(true);
//    	a = (Alien) q1.uniqueResult();
//    	System.out.println(a);
//    	
//    	session1.getTransaction().commit();
//    	session1.close();
//    	
//    	Session session2 = sf.openSession();
//    	session2.beginTransaction();
//    	
//    	Query q2 = session2.createQuery("FROM Alien WHERE aid=101");
//    	q2.setCacheable(true);
//    	a = (Alien) q2.uniqueResult();
//    	
////    	a = (Alien) session2.get(Alien.class, 101);
//    	System.out.println(a);
//    	
//    	session2.getTransaction().commit();
//    	session2.close();
    	
    	// HQL - Hibernate Query Language
    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();
//    	
    	Random random = new Random();
//    	
////    	for(int i = 1; i <= 50; i++) {
////    		Student s = new Student();
////    		s.setRollno(i);
////    		s.setName("Name" + i);
////    		s.setMarks(random.nextInt(100));
////    		session.save(s);
////    	}
//    	
//    	Query query1 = session.createQuery("FROM Student WHERE marks > 70");
//    	List<Student> students1 = query1.list();
//    	
//    	for(Student s : students1) {
//    		System.out.println(s);
//    	}
//    	
//    	Query query2 = session.createQuery("FROM Student WHERE rollno=7");
//    	Student student1 = (Student)query2.uniqueResult();
//    	
//    	System.out.println(student1);
//    	
//    	Query query3 = session.createQuery("SELECT rollno, name, marks FROM Student where rollno=7");
//    	Object[] student2 = (Object[]) query3.uniqueResult();
//    	System.out.println(student2[0] + " : " + student2[1] + " : " + student2[2]);
//    	
//    	Query query4 = session.createQuery("SELECT rollno, name, marks FROM Student");
////    	Query query4 = session.createQuery("SELECT rollno, name, marks FROM Student s WHERE s.marks>60");
////    	Query query4 = session.createQuery("SELECT sum(marks) FROM Student s WHERE marks>60");
//    	List<Object[]> students2 = (List<Object[]>) query4.list();
//    	for(Object[] student : students2) {
//    		System.out.println(student[0] + " : " + student[1] + " : " + student[2]);
//    	}
//    	
//    	// Prepared Statement
//    	int input = 60;
//    	Query query5 = session.createQuery("SELECT sum(marks) FROM Student s WHERE marks > :input");
//    	query5.setParameter("input", input);
//    	Long marks = (Long) query5.uniqueResult();
//    	System.out.println(marks);
    	
    	// SQL (Native Queries...) - Structured Query Language
//    	SQLQuery query1 = session.createSQLQuery("SELECT * FROM student WHERE marks>60");
//    	query1.addEntity(Student.class);
//    	List<Student> students1 = query1.list();
//    	for(Student s : students1) {
//    		System.out.println(s);
//    	}
//    	
//    	SQLQuery query2 = session.createSQLQuery("SELECT name, marks FROM student WHERE marks>60");
//    	query2.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//    	List students2 = query2.list();
//    	for(Object o : students2) {
//    		Map m = (Map) o;
//    		System.out.println(m.get("name") + " : " + m.get("marks"));
//    	}
    	
//    	for(int i = 1; i <= 50; i++) {
//			Laptop l = new Laptop();
//			l.setLid(i);
//			l.setBrand("Brand " + i);
//			l.setPrice(random.nextInt(1000));
//			session.save(l);
//    	}
    	
    	// Hibernate Object States / Persistence Life Cycles
    	
    	// New State
    	Laptop l = new Laptop(); 
    	
    	// Transient State
//		l.setLid(53);
//		l.setBrand("Lenovo");
//		l.setPrice(800);
    	
    	// Hibernate get() vs load()
    	Laptop l1 = session.load(Laptop.class, 5); // Proxy Object
    	try {
    		System.out.println("Reslut in...." + 3);
			Thread.sleep(1000);
			System.out.println("Reslut in...." + 2);
			Thread.sleep(1000);
			System.out.println("Reslut in...." + 1);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(l1);
    	
		
		// Persistent State
//		session.save(l);
//		l.setPrice(750);
		
		// Removed State
//		session.remove(l);
    	
    	session.getTransaction().commit();
    	
    	// Detached State
//    	session.detach(l); // In Fact after commit(), 
//    	l.setPrice(600);			   // the object will automatically go into detached state.
    					   // So this line is not necessary in this case, but can be used in other cases
    	session.close();
    }
}
