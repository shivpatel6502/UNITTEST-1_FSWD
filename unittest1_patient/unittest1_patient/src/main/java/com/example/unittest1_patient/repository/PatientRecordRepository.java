package com.example.unittest1_patient.repository;

import com.example.unittest1_patient.model.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Integer> {
}
