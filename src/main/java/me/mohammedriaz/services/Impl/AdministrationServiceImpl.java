package me.mohammedriaz.services.Impl;

import me.mohammedriaz.domain.employee.Administration;
import me.mohammedriaz.repositories.Impl.AdministrationRepositoryImpl;
import me.mohammedriaz.repositories.employees.AdministrationRepository;
import me.mohammedriaz.services.employees.AdministrationService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class AdministrationServiceImpl implements AdministrationService {

    private AdministrationServiceImpl service = null;
    private AdministrationRepository repository;

    public AdministrationServiceImpl() {
        repository = AdministrationRepositoryImpl.getAdministrationRepository();
    }

    public AdministrationServiceImpl getService(){

        if(service == null){
            return new AdministrationServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Administration> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Administration create(Administration administration) {
        return repository.create(administration);
    }

    @Override
    public Administration read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Administration update(Administration administration) {
        return repository.update(administration);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);
    }



}