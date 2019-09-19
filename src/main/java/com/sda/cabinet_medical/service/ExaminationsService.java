package com.sda.cabinet_medical.service;

import com.sda.cabinet_medical.model.Examinations;
import com.sda.cabinet_medical.repositories.ExaminationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminationsService {

    @Autowired
    private ExaminationsRepository examinationsRepository;

    public List<Examinations> getAllExaminations (){
        return examinationsRepository.findAll();
    }

}