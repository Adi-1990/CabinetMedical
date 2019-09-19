package com.sda.cabinet_medical.repositories;

import com.sda.cabinet_medical.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
