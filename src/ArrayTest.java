import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest {
 public static void main(String []args)
 {
	 //int a[]={1,2,3,4,5,6,7,8,9,10,11};
	 int []anonymous={17,19,23,29,31,37};
	 int []smallPrimes=anonymous;
	 int []luckyNumbers=smallPrimes;
	 luckyNumbers[5]=12;
	 Scanner in=new Scanner(System.in);
	 System.out.println("��������Ҫ���ݵı���: ");
	 int n=in.nextInt();
	 luckyNumbers=Arrays.copyOf(luckyNumbers, n*luckyNumbers.length); 
	 for(int i=0;i<luckyNumbers.length;i++)
	 {
		 System.out.println("a[i]="+luckyNumbers[i]);
	 }
 }
}
