package com.sda.cabinet_medical.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Fieldwork {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fieldWorkId;

    private String fieldWorkName;

    @ManyToMany(mappedBy = "fieldworks")
    private Set<User> users = new HashSet<>();


}
