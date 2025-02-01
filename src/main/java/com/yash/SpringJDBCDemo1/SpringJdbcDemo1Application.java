package com.yash.SpringJDBCDemo1;

import com.yash.SpringJDBCDemo1.model.Alien;
import com.yash.SpringJDBCDemo1.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemo1Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringJdbcDemo1Application.class, args);

        Alien alien = context.getBean(Alien.class);

        alien.setId(111);
        alien.setName("AAA");
        alien.setTech("Java");

        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(alien);

        System.out.println(repo.findAll());

    }

}
