package Exp3;

public class Manager extends Employee {
    private String teamName;
    private String projectName;
    private int projects_completed;

    Manager(String name, int age, String gender, String mobile, int employeeId,
         double salary, String department, String designation, String teamName,
          String projectName, int projects_completed){
        super(name, age, gender, mobile, employeeId, salary, department, designation);
        this.teamName = teamName;
        this.projectName = projectName;
        this.projects_completed = projects_completed;
    }

    void displayManager(){
        super.displayEmployee();

        System.out.println("Team Name :"+teamName);
        System.out.println("Project Name :"+projectName);
        System.out.println("Projects Completed :"+projects_completed);

    }
}
