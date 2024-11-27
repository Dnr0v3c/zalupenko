package com.oshchadbank.oshchad24.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;


@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Transactional
public class Clients {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String surname;

    @Transient
    private int age;


    private String telephone;

    private int balance;

}
