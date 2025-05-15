package service;

import model.Appointment;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 * AppointmentService handles scheduling and viewing appointments.
 */
public class AppointmentService {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public AppointmentService() {
        // Sample doctors added to the system
        doctors.add(new Doctor("Dr. Arjun", "Cardiologist"));
        doctors.add(new Doctor("Dr. Priya", "Dermatologist"));
        doctors.add(new Doctor("Dr. Meera", "General Physician"));
    }

    // List all doctors
    public void viewAllDoctors() {
        System.out.println("\n👨‍⚕️ Available Doctors:");
        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    // Schedule appointment
    public void scheduleAppointment(Patient patient, int doctorId, String date) {
        Doctor selectedDoctor = null;

        for (Doctor d : doctors) {
            if (d.getId() == doctorId) {
                selectedDoctor = d;
                break;
            }
        }

        if (selectedDoctor == null) {
            System.out.println("❌ Doctor not found.");
            return;
        }

        Appointment appointment = new Appointment(patient, selectedDoctor, date);
        appointments.add(appointment);
        System.out.println("\n✅ Appointment Scheduled Successfully:\n" + appointment);
    }

    // View all appointments
    public void viewAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("\n⚠️ No appointments scheduled.");
        } else {
            System.out.println("\n📅 Scheduled Appointments:");
            for (Appointment a : appointments) {
                System.out.println("\n" + a);
            }
        }
    }
}
