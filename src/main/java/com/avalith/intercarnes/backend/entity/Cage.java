package com.avalith.intercarnes.backend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int lotQuantity;
    private boolean hasToll;
    private float importToll;
    private float kilometers;
    private float freightBuyer;
    private float freightSeller;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;


}
