import java.util.*;

// Base class representing a student
abstract class Student {
    private String name;
    private int rollNo;
    private int scienceMarks;
    private int mathMarks;
    private int socialScienceMarks;
    private int lang1Marks;
    private int lang2Marks;

    public Student(String name, int rollNo, int scienceMarks, int mathMarks,
                   int socialScienceMarks, int lang1Marks, int lang2Marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.scienceMarks = scienceMarks;
        this.mathMarks = mathMarks;
        this.socialScienceMarks = socialScienceMarks;
        this.lang1Marks = lang1Marks;
        this.lang2Marks = lang2Marks;
    }

    public abstract double calculatePercentage();

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public int getSocialScienceMarks() {
        return socialScienceMarks;
    }

    public int getLang1Marks() {
        return lang1Marks;
    }

    public int getLang2Marks() {
        return lang2Marks;
    }
}

// Derived class representing a specific type of student - RegularStudent
class RegularStudent extends Student {
    public RegularStudent(String name, int rollNo, int scienceMarks, int mathMarks,
                          int socialScienceMarks, int lang1Marks, int lang2Marks) {
        super(name, rollNo, scienceMarks, mathMarks, socialScienceMarks, lang1Marks, lang2Marks);
    }

    public double calculatePercentage() {
        double totalMarks = getScienceMarks() + getMathMarks() + getSocialScienceMarks() +
                            getLang1Marks() + getLang2Marks();
        return (totalMarks / 5.0);
    }
}

// Interface for new student registration
interface StudentRegistration {
    void registerStudent();
}

// Interface for reading student details
interface StudentDetails {
    void readStudentDetails();
}

// Interface for student data management
interface StudentDataManagement {
    void deleteStudentData();
}

// Main class for generating report cards
public class ReportCardGenerator implements StudentRegistration, StudentDetails, StudentDataManagement {
    private static List<Student> students;

    public static void main(String[] args) {
        students = new ArrayList<>();
        loadData(); // Load student data

        ReportCardGenerator generator = new ReportCardGenerator();
        generator.registerStudent();
        generator.readStudentDetails();
        generator.deleteStudentData();
    }

    public static void generateReportCard(Student student) {
        System.out.println("Report Card");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Science: " + student.getScienceMarks());
        System.out.println("Math: " + student.getMathMarks());
        System.out.println("Social Science: " + student.getSocialScienceMarks());
        System.out.println("Lang 1: " + student.getLang1Marks());
        System.out.println("Lang 2: " + student.getLang2Marks());
        System.out.println("Percentage: " + student.calculatePercentage() + "%");
        System.out.println("---------------------------------");
    }

    public void registerStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("New Student Registration");
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter marks for Science: ");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter marks for Math: ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter marks for Social Science: ");
        int socialScienceMarks = scanner.nextInt();
        System.out.print("Enter marks for Language 1: ");
        int lang1Marks = scanner.nextInt();
        System.out.print("Enter marks for Language 2: ");
        int lang2Marks = scanner.nextInt();

        Student newStudent = new RegularStudent(name, rollNo, scienceMarks, mathMarks,
                                                socialScienceMarks, lang1Marks, lang2Marks);
        students.add(newStudent);
        System.out.println("New student registered successfully.");
    }

    public void readStudentDetails() {
        System.out.println("Student Details");
        for (Student student : students) {
            generateReportCard(student);
        }
    }

    public void deleteStudentData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Delete Student Data");
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        Student student = searchStudent(name, rollNo);
        if (student != null) {
            students.remove(student);
            System.out.println("Student data deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static Student searchStudent(String name, int rollNo) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name) && student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null;
    }

    public static void loadData() {
        // Add student data here
        students.add(new RegularStudent("Ayan P", 1, 25, 22, 23, 25, 24));
        students.add(new RegularStudent("Bina D", 2, 24, 23, 22, 22, 24));
        students.add(new RegularStudent("Christine F", 3, 2, 21, 22, 21, 22));
        students.add(new RegularStudent("Dhanush A", 4, 22, 23, 21, 21, 22));
        students.add(new RegularStudent("Fahim S", 5, 25, 21, 23, 23, 23));
        students.add(new RegularStudent("Mahi P", 6, 23, 22, 25, 22, 23));
        students.add(new RegularStudent("Nehal M", 7, 24, 24, 21, 21, 21));
        students.add(new RegularStudent("Parth K", 8, 21, 23, 21, 24, 23));
        students.add(new RegularStudent("Piyu M", 9, 22, 25, 23, 24, 25));
        students.add(new RegularStudent("Sameer A", 10, 25, 24, 21, 25, 24));
    }
}
