package com.sda.cabinet_medical.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Examinations {

    @Id
    @GeneratedValue
    private int examinationId;

    private String examinationName;
    private Date examinationLastingTime;
    private int doctorId;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User doctor;

    @OneToMany(mappedBy = "appoinments")
    private Set<Appoinments> appoinments;


}
