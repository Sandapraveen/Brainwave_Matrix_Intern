package service;

import model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patientList = new ArrayList<>();

    public void registerPatient(String name, int age, String gender, String contact) {
        Patient newPatient = new Patient(name, age, gender, contact);
        patientList.add(newPatient);
        System.out.println("\n✅ Patient Registered: " + newPatient);
    }

    public void viewAllPatients() {
        if (patientList.isEmpty()) {
            System.out.println("⚠️ No patients registered.");
        } else {
            System.out.println("\n👥 List of Patients:");
            for (Patient p : patientList) {
                System.out.println(p);
            }
        }
    }

    public Patient getPatientById(int id) {
        for (Patient p : patientList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
