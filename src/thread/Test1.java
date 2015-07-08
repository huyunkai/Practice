package thread;

public class Test1 {
  public static void main(String []args)
  {
	  int []str=new int[20];

	  for(int i=1;i<18;i++)
	  {   	 
		  str[0]=1;
	      str[1]=1;
		  str[i+1]=str[i]+str[i-1];
		  System.out.printf("%12d\t",str[i]);
		  if(i%5==0)
		  {
			  System.out.println();
		  }
	  }
	  
  }
}
