package com.ait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ait.dao.BookRepo;
import com.ait.entity.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		BookRepo bean = ctx.getBean(BookRepo.class);
		
		Book b=new Book();
		
		b.setBookid(120);
		b.setBookname("Maths");
		b.setBookprice(220.00);
		
		bean.save(b);

		System.out.println("data inserted succesfully...");
		
		
	}

}
