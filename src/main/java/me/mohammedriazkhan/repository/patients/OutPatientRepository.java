package me.mohammedriazkhan.repository.patients;

import me.mohammedriazkhan.domain.patients.Patient;
import me.mohammedriazkhan.repository.Repository;

import java.util.Set;

public interface OutPatientRepository extends Repository<Patient, Integer> {


    Set<Patient> getAll();

}