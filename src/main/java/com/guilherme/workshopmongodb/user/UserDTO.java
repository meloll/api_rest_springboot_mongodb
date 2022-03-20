package com.guilherme.workshopmongodb.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private String id;
    private String name;
    private String email;

    UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

}
