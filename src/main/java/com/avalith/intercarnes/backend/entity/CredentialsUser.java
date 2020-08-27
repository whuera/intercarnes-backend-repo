package com.avalith.intercarnes.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@ToString
@Entity
public class CredentialsUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String firebaseDeviceToken;

    @JsonBackReference
    @OneToOne(mappedBy = "credentialsUser", fetch = FetchType.LAZY)
    private Person person;

    public CredentialsUser() {
    }

    public CredentialsUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
