package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
//@ConfigurationProperties("my.data")
@Profile("qa")
@ToString
public class ProfileRunner implements CommandLineRunner {
	
	@Value("${my.data.message}")
	private String message;
	@Value("${my.data.code}")
	private String code;
	@Value("${my.data.mode}")
	private String mode;

	


	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
		
	}

}
