import java.util.Scanner;

//��1-10�еĻ���

public class Test2 {
	
  public static void main(String []args)
  {   
	  Scanner sc=new Scanner(System.in);
	  System.out.println("��������Ҫ����Ĵ�����");
	  int k=sc.nextInt();
	  while(k>0){
       int x=sc.nextInt();
//	     for(int i=2;i<=100;i++)
//	    {
//	    	 boolean f=true;
//	      for(int y=2; y<i; y++)
//	      {
//	    	  if(i % y==0)
//              {
//	          f=false;
//	    	  break;
//              }
//	      }
//	      if(f==true)
//	      System.out.println(i);
//	    }
       boolean f=true;
       for(int i=2;i<x;i++)
       {
    	   if(x%i==0)
    	   {
    		   f=false;
    		   break;
    	   }
    	   
       }
       if(f==true)
       {   System.out.printf("%d is the zhishu.",x);
           System.out.println();
       }
       else
       {
    	   System.out.printf("%d is not the zhishu",x);
    	   System.out.println();
       }  
	  k--;}
  }
}
