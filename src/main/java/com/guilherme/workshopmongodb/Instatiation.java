package com.guilherme.workshopmongodb;

import com.guilherme.workshopmongodb.user.User;
import com.guilherme.workshopmongodb.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instatiation implements CommandLineRunner {

    @Autowired
    private UserRepository repo;

    @Override
    public void run(String... args) throws Exception {

        repo.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        repo.saveAll(Arrays.asList(maria,alex,bob));


    }
}
