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
public class Role {
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

    private long idRol;

    @Column
    private String name;

    @Column
    private String description;

}