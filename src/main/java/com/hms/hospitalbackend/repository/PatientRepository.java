package com.hms.hospitalbackend.repository;

import com.hms.hospitalbackend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository
        extends JpaRepository<Patient,Integer> {

}
