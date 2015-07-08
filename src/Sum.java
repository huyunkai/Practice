import java.util.Scanner;


public class Sum {
  public static void main(String []args)
  {
	  Scanner in=new Scanner(System.in);
	   int sum=0;
	   int goal=100;
	   while(sum<goal)
	   {
		   System.out.println("Enter a number between 0 and 100 :");
		   int n=in.nextInt();
		   if(n<0||n>100) continue;
		   else
			   sum+=n;
		   
	   }
	   System.out.println("Sum ="+sum);
  }
}
