package com.example.DemoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
        Alien a = em.find(Alien.class, 4);
        System.out.println(a);
        
        Alien a1 = new Alien();
        a1.setAid(8);
        a1.setAname("Jaya");
        a1.setTech("Data Analytics");
        
        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();
        System.out.println(a1);
    }
}