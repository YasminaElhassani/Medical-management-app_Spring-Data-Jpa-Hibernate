package com.example.hospitalapplication.repositories;

import com.example.hospitalapplication.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
