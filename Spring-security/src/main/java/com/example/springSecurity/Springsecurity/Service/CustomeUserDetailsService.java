package com.example.springSecurity.Springsecurity.Service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springSecurity.Springsecurity.Entity.User;
import com.example.springSecurity.Springsecurity.Repository.UserDataRepository;

@Service
public class CustomeUserDetailsService implements UserDetailsService {

	@Autowired
	UserDataRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username);
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				(Collection<? extends GrantedAuthority>) new ArrayList<GrantedAuthority>());
	}

}
