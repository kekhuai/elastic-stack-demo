package com.example.elasticstackdemo;

import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api/v1/elk")
public class ElasticStackDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElasticStackDemoApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    Logger logger = LoggerFactory.getLogger(getClass());
    int i = 0;
    while (true) {
      TimeUnit.SECONDS.sleep(1);
      logger.error("number: {}", i);
      ++i;
    }
  }

  @GetMapping(path = "/ex")
  public void exception() {
    throw new RuntimeException("example stack trace");
  }

}
