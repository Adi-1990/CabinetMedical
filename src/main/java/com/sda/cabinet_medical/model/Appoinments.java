package com.sda.cabinet_medical.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Appoinments {

    @Id
    @GeneratedValue
    private int appointmentId;
    private Date dateAndTime;
    private int clientId;
    private int examinationId;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User pacient;

    @OneToMany(mappedBy = "appoinment")
    private Set<Examinations> examination;

}
