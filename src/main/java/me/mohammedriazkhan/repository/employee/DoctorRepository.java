package me.mohammedriazkhan.repository.employee;

import me.mohammedriazkhan.domain.employee.Doctor;
import me.mohammedriazkhan.repository.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

    //Set<Doctor> getAll();

}
