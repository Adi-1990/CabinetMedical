package com.sda.cabinet_medical.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    private String userName;
    private String CNP;
    private String firstName;
    private String lastName;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "User_Fieldwork",
            joinColumns = {@JoinColumn(name = "userId")},
            inverseJoinColumns = {@JoinColumn(name = "fieldWorkId")}
    )
    Set<Fieldwork> fieldworks = new HashSet<>();


    @OneToMany(mappedBy = "pacient")
    private Set<Appoinments> appoinment;

    @OneToMany(mappedBy = "doctor")
    private Set<Examinations> examination;

}