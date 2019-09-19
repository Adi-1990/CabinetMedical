package com.sda.cabinet_medical.repositories;

import com.sda.cabinet_medical.model.Examinations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExaminationsRepository extends JpaRepository<Examinations, Integer> {
}
