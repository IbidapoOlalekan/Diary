package com.technophiles.diaryapp.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document //makes the class be a table in the mongo db
@Getter
@Setter
// makes user need an email and a password
@NoArgsConstructor
public class User {
    @Id
    private String id;

    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
       return String.format("UserId: %s" +
               "Email: %s",id,email);
    }
}
