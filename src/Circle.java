import java.util.Scanner;


public class Circle {
 public static void main(String []args)
 {   Scanner in=new Scanner(System.in);
	 int balance=in.nextInt();
     int goal=in.nextInt();
     int payment=100;
     int interesRate=30;
     int years = 0;
     while(balance<goal)
     {
    	 balance +=payment;
    	 double interest=balance *interesRate /100;
    	 balance +=interest;
    	 years ++;
     }
	 
     System.out.println(years +" years.");
 }
}
