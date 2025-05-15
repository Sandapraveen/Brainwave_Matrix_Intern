package main;

import java.util.Scanner;

import model.Patient;
import service.AppointmentService;
import service.PatientService;

/**
 * Main class - Entry point of the Hospital Management System
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientService patientService = new PatientService();
        AppointmentService appointmentService = new AppointmentService();

        int choice;

        do {
            System.out.println("\n=== 🏥 Hospital Management System ===");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. View All Doctors");
            System.out.println("4. Schedule Appointment");
            System.out.println("5. View Appointments");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Contact Number: ");
                    String contact = scanner.nextLine();
                    patientService.registerPatient(name, age, gender, contact);
                    break;

                case 2:
                    patientService.viewAllPatients();
                    break;

                case 3:
                    appointmentService.viewAllDoctors();
                    break;

                case 4:
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();
                    Patient patient = patientService.getPatientById(patientId);
                    if (patient == null) {
                        System.out.println("❌ Patient not found.");
                        break;
                    }

                    appointmentService.viewAllDoctors();
                    System.out.print("Enter Doctor ID to book: ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Appointment Date (e.g., 2025-05-20): ");
                    String date = scanner.nextLine();
                    appointmentService.scheduleAppointment(patient, doctorId, date);
                    break;

                case 5:
                    appointmentService.viewAllAppointments();
                    break;

                case 6:
                    System.out.println("\n👋 Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
