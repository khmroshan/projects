package com.zsqllog.zsqllog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ZsqllogApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ZsqllogApplication.class);

	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(ZsqllogApplication.class, args);
	}

	@PostConstruct
	private void init(){
		LOGGER.info("------------------------------Initializing");
		addressRepository.findAll();
		LOGGER.info("------------------------------Ending");
	}



}
