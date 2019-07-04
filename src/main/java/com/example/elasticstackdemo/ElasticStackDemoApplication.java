package com.example.elasticstackdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticStackDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElasticStackDemoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    Logger logger = LoggerFactory.getLogger(getClass());
    for (int i = 0; i < 10; ++i) {
      logger.error("number: {}", i);
    }
  }

}
