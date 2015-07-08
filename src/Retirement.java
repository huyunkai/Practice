import java.util.Scanner;


public class Retirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //read inputs
		Scanner in =new Scanner(System.in);
		System.out.println("How much money do you need to retire?");
		double goal=in.nextDouble();
		System.out.println("How much money will you contribute every year?");
		double payment=in.nextDouble();
		System.out.println("Interest rate in %:");
		double interestRate=in.nextDouble();
		double balance=0;
		int years=0;
		//update account balance whle goal is not reached
		while(balance<goal)
		{
			//add this year's payment and interest
			balance+=payment;
			double interest=balance *interestRate /100;
			balance+=interest;
			years++;
			
		}
		System.out.println(years+" years.");
	}

}
