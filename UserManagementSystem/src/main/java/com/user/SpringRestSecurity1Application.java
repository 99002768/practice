package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.user.frontend.Firstpage;
import com.user.frontend.Registration;

@SpringBootApplication
public class SpringRestSecurity1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringRestSecurity1Application.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringRestSecurity1Application.class);
		builder.headless(false);

		ConfigurableApplicationContext context = builder.run(args);
//		 ConfigurableApplicationContext context = new SpringApplicationBuilder(Registration.class).headless(false).run(args);
//		    Firstpage appFrame = context.getBean(Firstpage.class);
	}
//	@Bean
	

}
