package me.mohammedriazkhan.repository.patient;

import me.mohammedriazkhan.domain.patient.Patient;
import me.mohammedriazkhan.repository.Repository;

import java.util.Set;

public interface InPatientRepository extends Repository<Patient, Integer> {


    Set<Patient> getAll();
}
