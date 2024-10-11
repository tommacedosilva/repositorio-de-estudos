package com.luv2code.springdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@SuppressWarnings("deprecation")
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// adc usuários para autenticação na memória
		
		UserBuilder users = User.withDefaultPasswordEncoder().password(null);
		
		auth.inMemoryAuthentication()
					.withUser(users.username("Tom").password("test123").roles("EMPLOYEE"))
					.withUser(users.username("Cin").password("test123").roles("EMPLOYEE", "MANAGER"))
					.withUser(users.username("Nino").password("test123").roles("EMPLOYEE", "ADMIN"));
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// segurança para todos os endpoints REST dentro de "/api/customers"
		http.authorizeRequests()
		.antMatchers("/api/customers/**").authenticated()
		.and()
		.httpBasic()
		.and()
		.csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		
		// adc a segurança de acesso para cada usuário de acordo com seu papel (role)
		
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/api/customers").hasRole("EMPLOYEE")
		.antMatchers(HttpMethod.GET, "/api/customers/**").hasRole("EMPLOYEE")
		.antMatchers(HttpMethod.POST, "/api/customers").hasAnyRole("MANAGER", "ADMIN")
		.antMatchers(HttpMethod.POST, "/api/customers/**").hasAnyRole("MANAGER", "ADMIN")
		.antMatchers(HttpMethod.PUT, "/api/customers").hasAnyRole("MANAGER", "ADMIN")
		.antMatchers(HttpMethod.PUT, "/api/customers/**").hasAnyRole("MANAGER", "ADMIN")
		.antMatchers(HttpMethod.DELETE, "/api/customers/**").hasAnyRole("ADMIN")
		.and()
		.httpBasic()
		.and()
		.csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
	}
	
	

}
