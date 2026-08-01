package Exp2;
/*Aim : Create a class to add two numbers.
        Use constructors overloading to initialize the data with either 
        default values or user provided values, Use method overloading 
        to add integer or double.
  Student Name: Ansari Mehreen Mansoor Jafri
  UIN/ Roll no. : 251P142/63
  Class: SE Comps div A
*/

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("******CALCULATOR PROGRAM******");
        System.out.println("=====================================");
        
        // Using Default Constructor
        Calculator c1 = new Calculator();
        System.out.println("--Using Default Constructor--");
        c1.add(3,4);
        c1.add(3.4,5.6);
        
        // Using Parameterized Constructor
        Calculator c2 = new Calculator(10, 20);
        System.out.println("--Using Parameterized Constructor--");
        c2.add(10 , 20);
        c2.add(30.5,40.8);

    }
    
}
