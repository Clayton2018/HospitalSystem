package me.mohammedriazkhan.repository.employee;

import me.mohammedriazkhan.domain.employee.Doctor;
import me.mohammedriazkhan.repository.Repository;

import java.util.Set;

public interface DoctorRepository extends Repository<Doctor, Integer> {

    Set<Doctor> getAll();

}
