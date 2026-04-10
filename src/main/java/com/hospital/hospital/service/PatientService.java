package com.hospital.hospital.service;

import com.hospital.hospital.entity.Patient;
import com.hospital.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    // Save patient
    public Patient savePatient(Patient patient) {
        return repository.save(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    // Get patient by ID
    public Patient getPatientById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Delete patient
    public void deletePatient(Long id) {
        repository.deleteById(id);
    }
}