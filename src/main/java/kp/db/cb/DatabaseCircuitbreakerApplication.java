package kp.db.cb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"kp.db.cb.controller", "kp.db.cb.dao", "kp.db.cb.repository"})
public class DatabaseCircuitbreakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseCircuitbreakerApplication.class, args);
    }
}
