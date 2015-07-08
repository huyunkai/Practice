import java.util.Scanner;


public class Retirement2 {
  public static void main(String []args)
  {
	  Scanner in=new Scanner(System.in);
	  System.out.println("How much money do you need to retire?");
	  double goal=in.nextDouble();
	  System.out.println("How much money will you contribute every year?");
	  double payment=in.nextDouble();
	  System.out.println("InterestRate in %:");
	  double interestRate=in.nextDouble();
	  double balance=0;
	  int year=0;
	  String input;
	  do
	  {
		//add this year's payment and interest
		  balance +=payment;
		  double interest =balance *interestRate /100;
		  balance +=interest;
		  year++;
		  System.out.printf("After year %d,your balance is %,.2f%n",year,balance);
		  System.out.printf("Ready to retire?(Y/N)");
		  input=in.next();
	  }
	  while(input.equals("N"));
	  System.out.println("We are not satisfied!byebye");
  }
}
