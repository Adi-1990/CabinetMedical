package com.sda.cabinet_medical.repositories;

import com.sda.cabinet_medical.model.Appoinments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoinmentsRepository extends JpaRepository<Appoinments, Integer> {
}
