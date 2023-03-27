package com.example.hospitalapplication.repositories;

import com.example.hospitalapplication.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String nom);
}
