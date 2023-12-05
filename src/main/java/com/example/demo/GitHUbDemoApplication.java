package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHUbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHUbDemoApplication.class, args);
		System.out.println("Main Method....");
		GitHUbDemoApplication application = new GitHUbDemoApplication();
		application.demo();
		
	}
	
	public void demo()
	{
		System.out.println("Demo Method....");
	}
	public void demo2()
	{
		System.out.println("Demo 2 Method....");
	}

}
