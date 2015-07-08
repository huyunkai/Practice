import java.util.Scanner;


public class statement {
	private String prefomance;
    private int bonus;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 statement sta=new statement();
     Scanner in =new Scanner(System.in);
     int n=in.nextInt();
  
     while(n>0)
     {
    	   int yourSales=in.nextInt();
    	     int target=in.nextInt();
    	 if(yourSales>=2*target)
     {
    	 sta.prefomance="Excellent";
         sta.bonus=1000;
         System.out.println(sta.prefomance);
     }
     else if(yourSales>=1.5*target)
     {
    	 sta.prefomance="Fine";
    	 sta.bonus=500;
    	 System.out.println(sta.prefomance);
     }
     else if(yourSales>=target)
     {
    	 sta.prefomance="Satisfactory";
    	 sta.bonus=100;
    	 System.out.println(sta.prefomance);
     }
     else
     {
    	 System.out.println("You're fired!");
     }
	n--;
     }
	}
}
