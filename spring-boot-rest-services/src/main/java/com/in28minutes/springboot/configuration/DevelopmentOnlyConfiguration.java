package com.in28minutes.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevelopmentOnlyConfiguration {
	@Bean
	@Primary
	public String dummy() {
		return "something";
	}
}
