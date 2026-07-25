/*Aim : To store and display Student information of few students.Information like name,UIN and cgpa.
  Student Name: Ansari Mehreen Mansoor Jafri
  UIN/ Roll no. : 251P142/63
  Class: SE Comps div A
*/

public class StudentTest{
    
    public static void main(String[]args) {

        //Student 1 Details
        Student s1 = new Student();
        s1.name = "Mehreen";
        s1.uin  = "251P142";
        s1.cgpa = 8.58;
        s1.display();

        //Student 2 Details
        Student s2 = new Student();
        s2.name = "Mahnoor";
        s2.uin  = "251S014";
        s2.cgpa = 8.23;
        s2.display();

        //Student 3 Details
        Student s3 = new Student();
        s3.name = "Aryan";
        s3.uin  = "251M019";
        s3.cgpa = 9.46;
        s3.display();
    }
}

class Student {
    String name;
    String uin;
    double cgpa;

 
    void display(){
        System.out.println("==========*********==========");
        System.out.println("Name : "+name);
        System.out.println("UIN : "+uin);
        System.out.println("CGPA : "+cgpa);
        System.out.println("==========*********==========");
    }

}
