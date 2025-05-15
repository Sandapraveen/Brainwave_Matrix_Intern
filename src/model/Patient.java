package model;

public class Patient {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(String name, int age, String gender, String contactNumber) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id +
               ", Name: " + name +
               ", Age: " + age +
               ", Gender: " + gender +
               ", Contact: " + contactNumber;
    }
}
