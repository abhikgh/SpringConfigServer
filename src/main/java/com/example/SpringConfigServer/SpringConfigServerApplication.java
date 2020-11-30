package com.example.SpringConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerApplication {

	//http://localhost:8888/SpringBootMQ/development
	//http://localhost:8888/SpringBootMQ/production
	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerApplication.class, args);
	}

}

//Create Git repo

/*
 * $ git init
 * 
 * $ git add .
 * 
 * $ git commit -m "initial commit"
 */
