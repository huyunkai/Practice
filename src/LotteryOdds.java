import java.util.Scanner;


public class LotteryOdds {
 public static void main(String []args)
 {
	 Scanner in=new Scanner(System.in);
	 System.out.println("How many numbers do you need to draw");
	 int k=in.nextInt();
	 System.out.println("What is the highest number you can draw?");
	 int n=in.nextInt();
	 /*
	  * compute binomal coeffcient n*(n-1)*...(n-k+1)/(1*2*3*4*5*£¬£¬£¬k)
	 */
	 int lotterOdds=1;
	 for(int i=1;i<=k;i++)
	 {
		 lotterOdds =(lotterOdds*(n-i+1))/i;
		 
	 }
	 System.out.println("You odds are 1 in "+lotterOdds+" .Good luck!");
 }
}
