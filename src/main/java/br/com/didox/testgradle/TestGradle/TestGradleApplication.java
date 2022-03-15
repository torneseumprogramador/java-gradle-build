package br.com.didox.testgradle.TestGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGradleApplication {

	public static void main(String[] args) {
		System.out.println("Tesde de execuçao");
		SpringApplication.run(TestGradleApplication.class, args);
	}

}
