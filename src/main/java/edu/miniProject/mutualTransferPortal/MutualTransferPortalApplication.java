package edu.miniProject.mutualTransferPortal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MutualTransferPortalApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(MutualTransferPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("starting code");
	}

}
