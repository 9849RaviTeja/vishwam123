package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.Entity.Product;
import com.example.demo.Reader.CsvReader;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class SbmbAssignment1Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context=SpringApplication.run(SbmbAssignment1Application.class, args);
	
	
	}

}
