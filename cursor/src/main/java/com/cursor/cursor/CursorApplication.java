package com.cursor.cursor;

import com.cursor.cursor.web.configuration.RsaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaProperties.class)
@SpringBootApplication
public class CursorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursorApplication.class, args);
	}

}
