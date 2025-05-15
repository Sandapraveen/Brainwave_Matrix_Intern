package model;

/**
 * Appointment class stores details of an appointment between a patient and a doctor.
 */
public class Appointment {
    private static int appointmentIdCounter = 1;
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentIdCounter++;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId +
               ", Date: " + date +
               "\nPatient: " + patient.getName() +
               " (ID: " + patient.getId() + ")" +
               "\nDoctor: " + doctor.getName() +
               " (ID: " + doctor.getId() + ", " + doctor.getSpecialization() + ")";
    }
}
