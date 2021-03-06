package me.mohammedriazkhan.domain.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import me.mohammedriazkhan.domain.patient.Patient;

import java.util.List;

public class Doctor extends Employee{

    private String specialisation;
    private List<Patient> patients;

    public Doctor(){

    }

    protected Doctor(DoctorBuilder builder) {
        super(builder);
        this.patients = builder.patients;
        this.specialisation = builder.specialisation;

    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public static class DoctorBuilder extends Employee.Builder{

        private String specialisation;
        private List<Patient> patients;

        public DoctorBuilder(){
            super();
        }


        public DoctorBuilder specialisation(String specialisation){
            this.specialisation = specialisation;
            return this;
        }

        public DoctorBuilder patients(List<Patient> patients){
            this.patients = patients;
            return this;
        }

        @Override
        public Employee build(){

            return new Doctor(this);

        }

        @Override
        public String toString() {
            return "DoctorBuilder{" +
                    "specialisation='" + specialisation + '\'' +
                    ", patients=" + patients +
                    "} " + super.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DoctorBuilder that = (DoctorBuilder) o;

            if (specialisation != null ? !specialisation.equals(that.specialisation) : that.specialisation != null)
                return false;
            return patients != null ? patients.equals(that.patients) : that.patients == null;

        }

        @Override
        public int hashCode() {
            int result = specialisation != null ? specialisation.hashCode() : 0;
            result = 31 * result + (patients != null ? patients.hashCode() : 0);
            return result;
        }
    }
}
