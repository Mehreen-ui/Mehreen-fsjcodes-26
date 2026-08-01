package Exp2;
public class Calculator {
    int a;
    int b;
    
    //Default Constructor
    Calculator(){
        a=0;
        b=0;
    }
    //Parameterized Constructor
    Calculator(int x,int y){
        a=x;
        b=y;
    }

    //Method to Add Integers
    void add(int i, int j ){
        int sum = i + j ;
System.out.println("======================================");
System.out.println("Addition of Integers");
System.out.println("First Number : "+i);
System.out.println("Second Number : "+j);
System.out.println("Result : " +sum); 
System.out.println("======================================");     
    }
    
    //Method to Add Double Values
    void add(double i, double j){
        double sum = i + j;
System.out.println("======================================");
System.out.println("Addition of Double Values");
System.out.println("First Number : "+i);
System.out.println("Second Number : "+j);
System.out.println("Result : "+sum);
System.out.println("======================================");
    }
}
