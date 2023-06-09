package com.example.hospitalapplication;

import com.example.hospitalapplication.entities.*;
import com.example.hospitalapplication.repositories.ConsultationRepository;
import com.example.hospitalapplication.repositories.MedecinRepository;
import com.example.hospitalapplication.repositories.PatientRepository;
import com.example.hospitalapplication.repositories.RendezVousRepository;
import com.example.hospitalapplication.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication{

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    CommandLineRunner start(IHospitalService hospitalService,
                            PatientRepository patientRepository,
                            RendezVousRepository rendezVousRepository,
                            MedecinRepository medecinRepository) {
        return args -> {
            Stream.of("Amine","Doha","Yasmine")
                    .forEach(name->{
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        hospitalService.savePatient(patient);
                    });

            Stream.of("Malak","Manal","Yassine")
                    .forEach(name->{
                        Medecin medecin=new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        hospitalService.saveMedecin(medecin);
                    });

            Patient patient=patientRepository.findById(1L).orElse(null);
            Patient patient1=patientRepository.findByNom("Malak");

            Medecin medecin=medecinRepository.findByNom("Yassine");

            RendezVous rendezVous=new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setPatient(patient);
            rendezVous.setMedecin(medecin);
            RendezVous saveRDV= hospitalService.saveRDV(rendezVous);
            System.out.println(saveRDV.getId());

            RendezVous rendezVous1=rendezVousRepository.findAll().get(0);

            Consultation consultation=new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRapport("Le Rapport de la consultation");
            consultation.setRendezVous(rendezVous1);
            hospitalService.saveConsultation(consultation);

        };
    }
}




