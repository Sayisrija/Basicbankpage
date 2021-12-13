package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		
		http.authorizeRequests()
		    .antMatchers("/balance").authenticated()
		    .antMatchers("/home").permitAll()
		    .antMatchers("/contacts").authenticated()
		    .antMatchers("/about").permitAll()
		    .and().formLogin()
		    .and().httpBasic();
		
		    
		    
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
			.withUser("srija").password("@123").authorities("admin").and()
			.withUser("preethi").password("1@23").authorities("admin").and()
			.withUser("sree").password("12@3").authorities("admin").and()
			.withUser("manu").password("123@").authorities("admin").and()
			.withUser("jashu").password("123").authorities("admin").and().passwordEncoder(NoOpPasswordEncoder.getInstance());

			
	}
	
	

}
