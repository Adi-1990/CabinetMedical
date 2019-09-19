package com.sda.cabinet_medical.service;

import com.sda.cabinet_medical.model.Fieldwork;
import com.sda.cabinet_medical.model.User;
import com.sda.cabinet_medical.repositories.FieldworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldworkService {

    @Autowired
    private FieldworkRepository fieldworkRepository;

    public List<Fieldwork> getAllFieldworks () {
        return fieldworkRepository.findAll();
    }

}