package com.guilherme.workshopmongodb.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Data
@AllArgsConstructor
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;


}



