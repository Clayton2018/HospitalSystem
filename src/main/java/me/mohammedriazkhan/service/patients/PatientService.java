package me.mohammedriazkhan.service.patients;

import me.mohammedriazkhan.domain.patients.Patient;
import me.mohammedriazkhan.service.Service;

import java.util.Set;

public interface PatientService extends Service<Patient, Integer> {
    Set<Patient> getAll();
}