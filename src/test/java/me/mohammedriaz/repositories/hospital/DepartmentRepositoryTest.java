package me.mohammedriaz.repositories.hospital;

import me.mohammedriaz.domain.hospital.Department;
import me.mohammedriaz.factories.hospital.DepartmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import me.mohammedriaz.repositories.Impl.DepartmentRepositoryImpl;

public class DepartmentRepositoryTest {

    DepartmentRepositoryImpl departmentRepository;

    @Before
    public void setUp() throws Exception {

        departmentRepository = DepartmentRepositoryImpl.getRepository();

    }

    @Test
    public void create() {

        Department department = DepartmentFactory.getDepartment(1, 1, null, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());

    }

    @Test
    public void read() {

        Department department = DepartmentFactory.getDepartment(1, 1, null, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());

        Department fromSet = departmentRepository.find(department.getDepartmentId());

        Assert.assertEquals(department, fromSet);


    }

    @Test
    public void update() {

        Department department = DepartmentFactory.getDepartment(1, 1, null, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());

        Department departmentUpdate = DepartmentFactory.getDepartment(1, 2, null, null);
        departmentUpdate.setDepartmentId(department.getDepartmentId());
        departmentRepository.update(departmentUpdate);

        Department updated = departmentRepository.find(departmentUpdate.getDepartmentId());

        Assert.assertEquals(departmentUpdate, updated);

    }

    @Test
    public void delete() {

        Department department = DepartmentFactory.getDepartment(1, 1, null, null);
        departmentRepository.create(department);

        Assert.assertNotNull(departmentRepository.getAll());

        departmentRepository.delete(department.getDepartmentId());

        Department dep = departmentRepository.find(department.getDepartmentId());

        Assert.assertNull(dep);


    }
}