package com.guilherme.workshopmongodb.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1","Maria Silva","maria@gmail.com");
        List<User> list = new ArrayList<>();
        list.add(maria);
        return ResponseEntity.ok().body(list);
    }

}
