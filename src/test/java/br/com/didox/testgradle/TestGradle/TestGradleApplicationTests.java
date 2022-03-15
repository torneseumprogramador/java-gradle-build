package br.com.didox.testgradle.TestGradle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestGradleApplicationTests {

	@Test
	void contextLoads() {
		int i = 3;
		assertEquals(3, i);
	}
}
