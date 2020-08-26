package com.avalith.intercarnes.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iDPerson;
    private String firstName;
    private String lastName;
    private String address;
    private String telephone;
    private String renspa;
    private String businessName;
    private String cuit;
    private boolean isBlocked;
    private boolean issuedDte;
    private float saleCommission;
    private float purchaseCommission;
    private String typeUser;
    private String email;

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_idCredentialsUser")
    private CredentialsUser credentialsUser;

}
