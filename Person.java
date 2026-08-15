package Exp3;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String mobile;

    Person( String name, int age, String gender, String mobile){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }

    void displayPerson(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+gender);
        System.out.println("Mobile number :"+mobile);
    }
    
}
