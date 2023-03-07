package com.getactiveprofile.getactiveprofile;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class GetactiveprofileApplication {
	@Autowired
	private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(GetactiveprofileApplication.class, args);
	}

	@PostConstruct
	public void init() {

		// fetch profiles from environment variables
		String[] profiles = env.getActiveProfiles();
		Arrays.stream(profiles).forEach(q-> System.out.println(q));

	}


}
