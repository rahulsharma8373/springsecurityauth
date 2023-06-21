package com.jwt.example.service;
import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("codeusingjava".equals(username)) {
			//password is 123. BCryptPasswordEncoder is used so encoded password is stored.
			return new User("codeusingjava", "$2a$10$xsahctaQ8BeMF175jkr8LuQoK1xFXC2vNnJlGnLlCV4w0jruWZGR2",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("username not present!!! " + username);
		}
	}

}
