package cdac.coreJava.Lab_assessment;

import java.util.*;

class Patient {
    int id;
    String name;
    int age;
    String disease;
    int priority;

    Patient(int id, String name, int age, String disease, int priority) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.priority = priority;
    }

    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Disease: " + disease +
                ", Priority: " + (priority == 1 ? "Emergency" : "Normal");
    }
}

public class HospitalManagementSystem {

    HashMap<Integer, Patient> patients = new HashMap<>();
    ArrayList<Patient> todayList = new ArrayList<>();

    PriorityQueue<Patient> queue = new PriorityQueue<>(
            Comparator.comparingInt(p -> p.priority));

    void addPatient(Patient p) {
        patients.put(p.id, p);
        todayList.add(p);
        queue.add(p);
        System.out.println("Patient added.");
    }

    void searchPatient(int id) {
        if (patients.containsKey(id)) {
            System.out.println("Patient found:");
            System.out.println(patients.get(id));
        } else {
            System.out.println("Patient not found.");
        }
    }

    void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("No patient.");
            return;
        }

        Patient p = queue.poll();
        System.out.println("Treating:");
        System.out.println(p);
    }

    void showPatients() {
        System.out.println("\nToday's Patients:");

        for (Patient p : todayList) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        HospitalManagementSystem h = new HospitalManagementSystem();

        h.addPatient(new Patient(101, "Prachi", 24, "Fever", 2));
        h.addPatient(new Patient(102, "Shristi", 30, "Accident", 1));
        h.addPatient(new Patient(103, "Amit", 45, "Headache", 2));

        h.searchPatient(102);

        h.treatPatient();
        h.treatPatient();

        h.showPatients();
    }
}