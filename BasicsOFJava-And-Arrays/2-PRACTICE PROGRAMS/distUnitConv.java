import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class distUnitConv {
    public static void main(String[] args) { //changed return type to - void
        int choice;
        // int selection; -never used
        // double units; -never used
        Scanner sc = new Scanner(System.in);

        String answer = "";
        while (true) {
            System.out.println("\n Do you want to continue?");
            answer = sc.next();

            if (answer.equals("Y") || answer.equals("y"))

            {
                System.out.println("Unit conversion table as follows:"); // menu should be displayed here
                System.out.println("1. CM to MR");
                System.out.println("2. MR to KM");
                System.out.println("3. KM to MR");
                System.out.println("4. MR to CM");

                System.out.print("Enter your menu :");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        // Centimeter to meter conversion :
                        System.out.print("Please enter the value in CM");
                        double centimeter1 = sc.nextDouble();
                        double meter1 = centimeter1 * 0.01;
                        System.out.print(centimeter1 + "CM = " + meter1 + " M");
                        break;

                    case 2:
                        // Meter to kilometer conversion :
                        System.out.print("Please enter the value in meters");
                        double meter2 = sc.nextDouble();
                        double kilometer2 = meter2 * 0.001;
                        System.out.print(meter2 + "MR = " + kilometer2 + " KM");

                        break;

                    case 3:
                        // Kilometer to meter conversion :
                        System.out.print("Please enter the value in kilometers");
                        double kilometer3 = sc.nextDouble();
                        double meter3 = kilometer3 * 1000;
                        System.out.print(kilometer3 + "KM = " + meter3 + " M");

                        break;

                    case 4:
                        // Meter to centimeter conversion :
                        System.out.print("Please enter the value in meters");
                        double meter4 = sc.nextDouble();
                        double centimeter4 = meter4 * 100;
                        System.out.print(meter4 + "MR = " + centimeter4 + " CM");

                        break;

                }
            } else {
                System.out.println("Thank you!");
                break;
            }
        }
        sc.close();
    }

}
