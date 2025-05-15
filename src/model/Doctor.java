package model;

/**
 * Doctor class stores information about a doctor.
 */
public class Doctor {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.id = idCounter++;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization;
    }
}
