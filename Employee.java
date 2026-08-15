package Exp3;

public class Employee extends Person {
    private int employeeId;
    private double salary;
    private String department;
    private String designaton;

    Employee(String name, int age, String gender, String mobile, 
        int employeeId, double salary, String department, String designation){
        super(name,age,gender,mobile);
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
        this.designaton = designation;
    }

    void displayEmployee(){
        super.displayPerson();

        System.out.println("Employee ID : "+employeeId);
        System.out.println("Salary :"+salary);
        System.out.println("Department :"+department);
        System.out.println("Designation :"+designaton);
    }
}
