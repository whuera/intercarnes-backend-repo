package com.avalith.intercarnes.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@ToString
@Entity
public class CredentialsUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String firebaseDeviceToken;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idPerson", referencedColumnName = "id")
    private Person person;

    public CredentialsUser() {
    }

    public CredentialsUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "CredentialsUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firebaseDeviceToken='" + firebaseDeviceToken + '\'' +
                ", person=" + person.getId() +
                '}';
    }
}
