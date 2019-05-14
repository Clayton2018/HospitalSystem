package me.mohammedriazkhan.repository.employee;

import me.mohammedriazkhan.domain.employee.Administration;
import me.mohammedriazkhan.factory.employee.AdministrationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import me.mohammedriazkhan.repository.employee.impl.AdministrationRepositoryImpl;

public class AdministrationRepositoryTest {

    AdministrationRepositoryImpl administrationRepository;

    @Before
    public void setUp() throws Exception {

        administrationRepository = AdministrationRepositoryImpl.getAdministrationRepository();

    }

    @Test
    public void create() {

        Administration admin = AdministrationFactory.getAdministration();
        administrationRepository.create(admin);

        Assert.assertNotNull(administrationRepository.getAll());

    }

    @Test
    public void read() {

        //Create a admin staff and add to set
        Administration admin = AdministrationFactory.getAdministration();
        administrationRepository.create(admin);

        //retrieve the adminStaff
        Administration adminInSet = administrationRepository.read(admin.getEmployeeId());

        Assert.assertEquals(admin, adminInSet);

    }

    @Test
    public void update() {

        //Create a admin staff and add to set
        Administration admin = AdministrationFactory.getAdministration();
        administrationRepository.create(admin);

        //updated version
        Administration adminUpdate = AdministrationFactory.getAdministration();
        adminUpdate.setEmployeeId(admin.getEmployeeId());
        administrationRepository.update(adminUpdate);

        //get the updated version
        Administration updatedVersion = administrationRepository.read(adminUpdate.getEmployeeId());

        Assert.assertEquals(adminUpdate, updatedVersion);

    }

    @Test
    public void delete() {

        //Create a admin staff and add to set
        Administration admin = AdministrationFactory.getAdministration();
        administrationRepository.create(admin);

        //checks that its not empty
        Assert.assertNotNull(administrationRepository.getAll());

        administrationRepository.delete(admin.getEmployeeId());

        //check if its deleted
        Administration updatedVersion = administrationRepository.read(admin.getEmployeeId());

        Assert.assertNull(updatedVersion);//will pass if its not there


    }
}