import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

class Clinic {
    private String name;
    private String center;

    public Clinic(String name, String center) {
        this.name = name;
        this.center = center;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcenter() {
        return center;
    }

    public void setcenter(String center) {
        this.center = center;
    }
}

class Patient {
    private String name;
    private int age;
    private String gender;

    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

class Doctor {
    private String name;
    private String Degree;

    public Doctor(String name, String Degree) {
        this.name = name;
        this.Degree = Degree;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public String getDegree() {
        return Degree;
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    private LocalTime time;

    public Appointment(Patient patient, Doctor doctor, LocalDate date, LocalTime time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    // Getters and setters

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}

class Hospital {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private Map<LocalDate, List<Appointment>> appointmentSchedule;
    private Clinic Clinic;

    public Hospital(String centerName, String center) {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointmentSchedule = new HashMap<>();
        Clinic = new Clinic(centerName, center);
    }

    public void addPatient(String name, int age, String gender) {
        Patient patient = new Patient(name, age, gender);
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void addDoctor(String name, String Degree) {
        Doctor doctor = new Doctor(name, Degree);
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void addAppointment(Patient patient, Doctor doctor, LocalDate date, LocalTime time) {
        Appointment appointment = new Appointment(patient, doctor, date, time);
        List<Appointment> appointments = appointmentSchedule.getOrDefault(date, new ArrayList<>());
        appointments.add(appointment);
        appointmentSchedule.put(date, appointments);
        System.out.println("Appointment booked successfully.");
    }

    public void displayPatients() {
        System.out.println("---- List of Patients ----");
        for (Patient patient : patients) {
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Gender: " + patient.getGender());
            System.out.println("--------------------------");
        }
    }

    public void displayDoctors() {
        System.out.println("---- List of Doctors ----");
        for (Doctor doctor : doctors) {
            System.out.println("Name: " + doctor.getName());
            System.out.println("Degree: " + doctor.getDegree());
            System.out.println("------------------------");
        }
    }

    public void displayAppointments(LocalDate date) {
        System.out.println("---- Appointments on " + date + " ----");
        List<Appointment> appointments = appointmentSchedule.getOrDefault(date, new ArrayList<>());
        for (Appointment appointment : appointments) {
            System.out.println("Patient: " + appointment.getPatient().getName());
            System.out.println("Doctor: " + appointment.getDoctor().getName());
            System.out.println("Time: " + appointment.getTime());
            System.out.println("------------------------");
        }
    }

    // Getters and setters for Clinic

    public Clinic getClinic() {
        return Clinic;
    }

    public void setClinic(Clinic Clinic) {
        this.Clinic = Clinic;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("ABC Clinic", "City Hospital Road");
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------ Hospital Management System ------");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book an Appointment");
            System.out.println("4. Display Patients");
            System.out.println("5. Display Doctors");
            System.out.println("6. Display Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.next();
                    System.out.print("Enter patient age: ");
                    int patientAge = scanner.nextInt();
                    System.out.print("Enter patient gender: ");
                    String patientGender = scanner.next();
                    hospital.addPatient(patientName, patientAge, patientGender);
                    break;

                case 2:
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.next();
                    System.out.print("Enter doctor Degree: ");
                    String doctorDegree = scanner.next();
                    hospital.addDoctor(doctorName, doctorDegree);
                    break;

                case 3:
                    System.out.print("Enter patient name: ");
                    String pName = scanner.next();
                    System.out.print("Enter doctor name: ");
                    String dName = scanner.next();
                    System.out.print("Enter appointment date (YYYY-MM-DD): ");
                    String dateString = scanner.next();
                    LocalDate date = LocalDate.parse(dateString);
                    System.out.print("Enter appointment time (HH:MM): ");
                    String timeString = scanner.next();
                    LocalTime time = LocalTime.parse(timeString);
                    Patient patient = findPatient(hospital, pName);
                    Doctor doctor = findDoctor(hospital, dName);
                    if (patient != null && doctor != null) {
                        hospital.addAppointment(patient, doctor, date, time);
                    } else {
                        System.out.println("Patient or doctor not found.");
                    }
                    break;

                case 4:
                    hospital.displayPatients();
                    break;

                case 5:
                    hospital.displayDoctors();
                    break;

                case 6:
                    System.out.print("Enter appointment date (YYYY-MM-DD): ");
                    String apptDateString = scanner.next();
                    LocalDate apptDate = LocalDate.parse(apptDateString);
                    hospital.displayAppointments(apptDate);
                    break;

                case 0:
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    public static Patient findPatient(Hospital hospital, String name) {
        for (Patient patient : hospital.getPatients()) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    public static Doctor findDoctor(Hospital hospital, String name) {
        for (Doctor doctor : hospital.getDoctors()) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        return null;
    }
}
