package me.mohammedriazkhan.repository.employee;

import me.mohammedriazkhan.domain.employee.Cleaner;
import me.mohammedriazkhan.repository.Repository;

import java.util.Set;

public interface CleanerRepository extends Repository<Cleaner, Integer> {

    Set<Cleaner> getAll();


}
