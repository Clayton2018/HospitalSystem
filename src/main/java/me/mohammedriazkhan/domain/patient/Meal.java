package me.mohammedriazkhan.domain.patient;

public class Meal {

    private int mealId;
    private String breakfast;
    private String lunch;
    private String supper;
    private Patient patient;


    public Meal(){

    }


    private Meal(MealBuilder builder){

        this.mealId = builder.mealId;
        this.breakfast = builder.breakfast;
        this.lunch = builder.lunch;
        this.supper = builder.supper;
        this.patient = builder.patient;

    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getSupper() {
        return supper;
    }

    public void setSupper(String supper) {
        this.supper = supper;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public static class MealBuilder{
        private int mealId;
        private String breakfast;
        private String lunch;
        private String supper;
        private Patient patient;

        public MealBuilder mealId(int mealId){
            this.mealId = mealId;
            return this;
        }

        public MealBuilder breakfast(String breakfast){
            this.breakfast = breakfast;
            return this;
        }

        public MealBuilder lunch(String lunch){
            this.lunch = lunch;
            return this;
        }

        public MealBuilder supper(String supper){
            this.supper = supper;
            return this;
        }

        public MealBuilder patient(Patient patient){
            this.patient = patient;
            return this;
        }


        public Meal build(){
            return new Meal(this);
        }

        @Override
        public String toString() {
            return "MealBuilder{" +
                    "mealId=" + mealId +
                    ", breakfast='" + breakfast + '\'' +
                    ", lunch='" + lunch + '\'' +
                    ", supper='" + supper + '\'' +
                    ", patient=" + patient +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MealBuilder that = (MealBuilder) o;

            if (mealId != that.mealId) return false;
            if (breakfast != null ? !breakfast.equals(that.breakfast) : that.breakfast != null) return false;
            if (lunch != null ? !lunch.equals(that.lunch) : that.lunch != null) return false;
            if (supper != null ? !supper.equals(that.supper) : that.supper != null) return false;
            return patient != null ? patient.equals(that.patient) : that.patient == null;

        }

        @Override
        public int hashCode() {
            int result = mealId;
            result = 31 * result + (breakfast != null ? breakfast.hashCode() : 0);
            result = 31 * result + (lunch != null ? lunch.hashCode() : 0);
            result = 31 * result + (supper != null ? supper.hashCode() : 0);
            result = 31 * result + (patient != null ? patient.hashCode() : 0);
            return result;
        }
    }

}
