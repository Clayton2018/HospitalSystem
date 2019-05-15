package me.mohammedriazkhan.factory.employee;

import me.mohammedriazkhan.domain.employee.Administration;
import me.mohammedriazkhan.utility.IDGenerator;

public class AdministrationFactory {

    public static Administration getAdministration(int empId, String access) {
        return (Administration) new Administration.AdminBuilder()
                .accessLevel(access)
                .employeeId(empId)
                .build();
    }




}
