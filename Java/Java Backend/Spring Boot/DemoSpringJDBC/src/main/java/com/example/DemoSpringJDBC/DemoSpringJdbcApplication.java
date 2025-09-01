package com.example.DemoSpringJDBC;

import com.example.DemoSpringJDBC.model.Alien;
import com.example.DemoSpringJDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringJdbcApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoSpringJdbcApplication.class, args);

        Alien a1 = context.getBean(Alien.class);
        a1.setId(111);
        a1.setName("Jithu");
        a1.setTech("Java Spring Boot");

        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(a1);
        System.out.println(repo.findAll());;
	}

}