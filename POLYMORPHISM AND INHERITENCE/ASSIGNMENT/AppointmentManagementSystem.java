import java.util.Scanner;

public class AppointmentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] visitorNames = new String[10];
        int[] visitorAges = new int[10];
        String[] visitorGenders = new String[10];
        String[] visitorContactNumbers = new String[10];
        int[] visitorCheckInDates = new int[10];
        int[] visitorCheckInMonths = new int[10];
        int[] visitorCheckInYears = new int[10];
        int[] visitorCheckOutDates = new int[10];
        int[] visitorCheckOutMonths = new int[10];
        int[] visitorCheckOutYears = new int[10];
        int visitorCount = 0;

        System.out.println("Welcome to the hospital visitor entry management system!");

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new visitor entry");
            System.out.println("2. View all visitor entries");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Please enter the visitor's name:");
                String name = scanner.next();
                System.out.println("Please enter the visitor's age:");
                int age = scanner.nextInt();
                System.out.println("Please enter the visitor's gender:");
                String gender = scanner.next();
                System.out.println("Please enter the visitor's contact number:");
                String contactNumber = scanner.next();
                System.out.println("Please enter the visitor's check-in date (DD MM YYYY):");
                int checkInDate = scanner.nextInt();
                int checkInMonth = scanner.nextInt();
                int checkInYear = scanner.nextInt();

                visitorNames[visitorCount] = name;
                visitorAges[visitorCount] = age;
                visitorGenders[visitorCount] = gender;
                visitorContactNumbers[visitorCount] = contactNumber;
                visitorCheckInDates[visitorCount] = checkInDate;
                visitorCheckInMonths[visitorCount] = checkInMonth;
                visitorCheckInYears[visitorCount] = checkInYear;

                visitorCount++;
            } else if (choice == 2) {
                System.out.println("Visitor Entries:");
                System.out.println("Name\tAge\tGender\tContact Number\tCheck-in Date");

                for (int i = 0; i < visitorCount; i++) {
                    System.out.println(visitorNames[i] + "\t" + visitorAges[i] + "\t" + visitorGenders[i] + "\t" +
                            visitorContactNumbers[i] + "\t" + visitorCheckInDates[i] + "/" + visitorCheckInMonths[i] + "/" + visitorCheckInYears[i]);
                }
            } else if (choice == 3) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
