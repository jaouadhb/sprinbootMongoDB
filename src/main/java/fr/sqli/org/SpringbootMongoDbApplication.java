package fr.sqli.org;

import fr.sqli.org.domaine.Review;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongoDbApplication.class, args);
    }

}
