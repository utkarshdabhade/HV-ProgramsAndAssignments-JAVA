import java.util.Scanner;

public class studentGradeGPA {
public static void main(String[] args) {
    
double marks = 0, totalMarks = 0;
float percentage;
char grade;
double GPA;
String name;

Scanner sc;
sc = new Scanner(System.in);

System.out.println("Enter the student name :");
name = sc.nextLine();

System.out.println("Enter the marks obtained to " + name);
marks = sc.nextInt();

System.out.println("Enter the total marks ");
totalMarks = sc.nextInt();

percentage = (float) ((marks*100)/totalMarks);
System.out.println("The percentage obtained is " + percentage + " % ");


if (percentage >= 90 && percentage <= 100) {
    grade = 'A';
    GPA =  4.0;
    System.out.println(name + " has scored " + " grade" + grade + " with GPA " + GPA);
    
        }  

    else 
        if (percentage >= 80 && percentage <= 89) {
        grade = 'B';
        GPA =  3.0;
        System.out.println(name + " has scored " + " grade " + grade + " with GPA " + GPA);

    }


        else 
            if (percentage >= 70 && percentage <= 79) {
            grade = 'C';
            GPA =  2.0;
            System.out.println(name + " has scored " + " grade " + grade + " with GPA " + GPA);

    }


            else 
                if (percentage >= 60 && percentage <= 69) {
                grade = 'D';
                GPA =  1.0;
                System.out.println(name + " has scored " + " grade " + grade + " with GPA " + GPA);

}


                    else 
                        if (percentage >= 31 && percentage <= 59) {
                        grade = 'F';
                        GPA =  0.0;
                        System.out.println(name + " has scored " + " grade " + grade + " with GPA " + GPA);


                        
}



}
}











