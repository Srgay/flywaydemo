package com.example.flyway;

import com.zaxxer.hikari.HikariDataSource;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@SpringBootApplication
public class FlywayApplication {


    public static void main(String[] args) {
        SpringApplication.run(FlywayApplication.class, args);
    }

}

/*@Component
class FlywayDemo implements CommandLineRunner {
    @Autowired
    private DataSource hikariDataSource;

    @Override
    public void run(String... args) throws Exception {
        Flyway flyway = Flyway
                .configure()
                .dataSource(hikariDataSource)
                .locations("classpath:foobar","classpath:db.migration")
                .load();
        flyway.migrate();
    }
}*/

