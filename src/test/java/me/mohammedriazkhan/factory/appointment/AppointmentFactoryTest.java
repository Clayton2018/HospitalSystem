package me.mohammedriazkhan.factory.appointment;

import me.mohammedriazkhan.domain.appoinments.Appointment;
import me.mohammedriazkhan.domain.employee.Doctor;
import me.mohammedriazkhan.domain.patients.InPatient;
import me.mohammedriazkhan.domain.patients.Meal;
import me.mohammedriazkhan.factory.employee.DoctorFactory;
import me.mohammedriazkhan.factory.patients.InPatientFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AppointmentFactoryTest {

    @Test
    public void getAppointment() {


        ArrayList list = new ArrayList();

        Doctor doc = DoctorFactory.getDoctor("Moh", "Khan", "Renal");


        List<Meal> m = new ArrayList<>();
        List<String> d = new ArrayList<>();

        InPatient patient = InPatientFactory.getInPatient("riaz", "khan", "1", "12345" ,23, doc);

        Appointment appointment = AppointmentFactory.getAppointment
                (1, "17-04-2018", patient);

        Assert.assertNotNull(appointment.getAppointmentId());


    }
}