package dev.berkekim.contentcalendar;

import dev.berkekim.contentcalendar.config.ContentCalendarProperties;
import dev.berkekim.contentcalendar.model.Content;
import dev.berkekim.contentcalendar.model.Status;
import dev.berkekim.contentcalendar.model.Type;
import dev.berkekim.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);




	}



}
