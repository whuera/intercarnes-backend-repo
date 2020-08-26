package com.avalith.intercarnes.backend.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CredentialsUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCredentialsUser;
    private String username;
    private String password;
    private String firebaseDeviceToken;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idPerson")
    private Person person;

}
