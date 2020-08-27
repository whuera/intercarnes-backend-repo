package com.avalith.intercarnes.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Data
@AllArgsConstructor
@ToString
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
    private String status;
    private String tokenCarrier;
    private String licensePlate;

    public Person() {
    }

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, optional = false)
    @JoinColumn(name = "fk_userCredentials", referencedColumnName = "id")
    private CredentialsUser credentialsUser;

    public CredentialsUser getCredentialsUser() {
        return credentialsUser;
    }

    public void setCredentialsUser(CredentialsUser credentialsUser) {
        this.credentialsUser = credentialsUser;
    }

    @ManyToMany
    @JoinTable(name="person_roles"
            ,joinColumns = @JoinColumn(name = "person_id")
            ,inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    @PrePersist
    void preInsert(){
        if(this.status == null)
            this.status = "INACTIVE";
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", renspa='" + renspa + '\'' +
                ", businessName='" + businessName + '\'' +
                ", cuit='" + cuit + '\'' +
                ", isBlocked=" + isBlocked +
                ", issuedDte=" + issuedDte +
                ", saleCommission=" + saleCommission +
                ", purchaseCommission=" + purchaseCommission +
                ", typeUser='" + typeUser + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", credentialsUser=" + credentialsUser +
                ", roles=" + roles +
                '}';
    }
}
