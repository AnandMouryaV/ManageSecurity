package com.example.springSecurity.Springsecurity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.example.springSecurity.Springsecurity.Entity.User;
import com.example.springSecurity.Springsecurity.Repository.UserDataRepository;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityApplication {

	@Autowired
	UserDataRepository userRepository;

	/*
	 * @PostConstruct
	 * 
	 * public void initUSers() {
	 * 
	 * List<User> users = Stream .of(new User(null, "Anand", "Mourya", "Admin"), new
	 * User(null, "Vajjala", "12345", "User"), new
	 * User(null,"Sindhura","6789","User")) .collect(Collectors.toList());
	 * 
	 * userRepository.saveAll(users); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
