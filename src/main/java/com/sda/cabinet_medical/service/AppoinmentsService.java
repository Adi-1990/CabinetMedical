package com.sda.cabinet_medical.service;

import com.sda.cabinet_medical.model.Appoinments;
import com.sda.cabinet_medical.repositories.AppoinmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppoinmentsService {

    @Autowired
    private AppoinmentsRepository appoinmentsRepository;

    public List<Appoinments> getAllAppointments(){
        return appoinmentsRepository.findAll();
    }

}