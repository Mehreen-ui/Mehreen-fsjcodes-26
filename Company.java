package Exp3;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
        System.out.print("Enter your Name :");
        String name = sc.nextLine();
        System.out.print("Enter your Age :");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender :");
        String gender = sc.nextLine();
        System.out.print("Enter Mobile Number : ");
        String mobile = sc.nextLine();
        System.out.print("Enter Employee ID :");
        int employeeId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Salary :");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department :");
        String department = sc.nextLine();
        System.out.print("Enter Designation :");
        String designation = sc.nextLine();
        System.out.print("Enter Team Name :");
        String teamName = sc.nextLine();
        System.out.print("Enter Current Project Name :");
        String projectName = sc.nextLine();
        System.out.print("Enter the Number of Projects Completed :");
        int project_completed = sc.nextInt();

        Manager m1 = new Manager(name, age, gender, mobile, employeeId, salary,
             department, designation, teamName, projectName, project_completed);

        System.out.println("========MANAGER DETAILS========");
        m1.displayManager();
        }
          catch(Exception e){
            System.out.println("INVALID SALARY INPUT!!!");
          }
        sc.close();
    }
    
}
