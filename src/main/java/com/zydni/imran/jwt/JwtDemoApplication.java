package com.zydni.imran.jwt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@ComponentScan(basePackages = "com.zydni.imran.jwt.config")
//@ComponentScan(basePackages = "com.zydni.imran.jwt.controller")
//@ComponentScan(basePackages = "com.zydni.imran.jwt.entity")
//@ComponentScan(basePackages = "com.zydni.imran.jwt.filter")
//@ComponentScan(basePackages = "com.zydni.imran.jwt.model")
//@ComponentScan(basePackages = "com.zydni.imran.jwt.repository")
//@ComponentScan(basePackages = "com.zydni.imran.jwt.service")
//@ComponentScan(basePackages = "com.zydni.imran.jwt.utility")
@SpringBootApplication
public class JwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
