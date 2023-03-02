package com.tutorialsz.readvalue.zreadvalue;



import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ZreadvalueApplication {
	
	@Value("${custom.value}")
    private String customValue;
	
	 @Autowired
	 private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ZreadvalueApplication.class, args);
	}
	
	@PostConstruct
    public void init() {
       System.out.println("Custom Value :"+customValue);
       
       System.out.println("Custom Value using env :"+ env.getProperty("custom.value"));
    }

}
