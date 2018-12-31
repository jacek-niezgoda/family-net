package pl.jacekniezgoda.familynet;

import com.arangodb.springframework.annotation.EnableArangoRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableArangoRepositories
@ComponentScan
@EnableWebMvc
public class FamilyNetApp {
    public static void main(final String... args) {
        SpringApplication.run(FamilyNetApp.class, args);
    }
}
