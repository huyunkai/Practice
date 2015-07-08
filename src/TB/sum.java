package TB;

public class sum {
 public static void main(String   []args)
 {
//	 int sum = 0;
//	 for(int i=0;i<=100;i+=2)
//		 sum+=i;
//	 System.out.println(sum);
	 
	 System.out.println(OS());
 }
 public static int OS()
 {   int sum=0;
	 for(int i=1;i<=100;i++)
	 {
		 if(i%2==0)
			 sum+=i;
	 }
	 return sum;
 }
 }
