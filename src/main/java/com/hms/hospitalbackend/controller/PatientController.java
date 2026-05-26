package com.hms.hospitalbackend.controller;

import com.hms.hospitalbackend.model.Patient;
import com.hms.hospitalbackend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientRepository repo;

    @GetMapping
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return repo.save(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        repo.deleteById(id);
    }
}