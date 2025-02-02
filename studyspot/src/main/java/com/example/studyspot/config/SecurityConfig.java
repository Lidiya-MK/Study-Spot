package com.example.studyspot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) 
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/api/students/signup", "/api/instructors/signup","/api/admins/signup").permitAll() 
                        .anyRequest().authenticated()); 
        return http.build();
    }
}
