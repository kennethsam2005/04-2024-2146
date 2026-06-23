import java.util.Scanner;

public class StudentInfo {
    static void main() {
        Scanner input = new Scanner(System.in);

        //Declare variables
        String fullname, indexNumber, gender, department, academicClass;
        int age, level;
        double gpa;

        //Collect input
        System.out.println("Enter your fullname");
        fullname = input.nextLine();
        System.out.println("Enter your indexNumber");
        indexNumber = input.nextLine();
        System.out.println("Enter your age");
        age = input.nextInt();

        System.out.println("Enter your gender");
        gender = input.nextLine();
        System.out.println("Enter your department");
        department = input.nextLine();
        System.out.println("Enter your level");
        level = input.nextInt();
        System.out.println("Enter GPA");
        gpa = input.nextDouble();

        //Determine adult status
        String adultstatus;
        if (age >= 18) {
            adultstatus = "Yes";
        } else {
            adultstatus = "NO";
        }

        //Determine academic classification
        if (gpa >= 3.5 && gpa <= 4.0) {
            academicClass = "First Class";
        } else if (gpa >= 3.0) {
            academicClass = "Second Class Upper";
        } else if (gpa >= 2.5) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }
        //Display student profile
        System.out.println("====STUDENT PROFILE");
        System.out.println("Name:" + fullname);
        System.out.println("Index:" + indexNumber);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("Department:" + department);
        System.out.println("Level:" + level);
        System.out.println("GPA:" + gpa);
        System.out.println("Adult Status:" + adultstatus);
        System.out.println("Academic Class:" + academicClass);

    }

}
