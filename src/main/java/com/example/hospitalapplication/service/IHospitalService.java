package com.example.hospitalapplication.service;

import com.example.hospitalapplication.entities.Consultation;
import com.example.hospitalapplication.entities.Medecin;
import com.example.hospitalapplication.entities.Patient;
import com.example.hospitalapplication.entities.RendezVous;

public interface IHospitalService {

    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
