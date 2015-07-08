package TB;

public class Demo implements Runnable{
   public void run()
   {
	   for(int x=0;x<70;x++)
		   
	   {
		   System.out.println(Thread.currentThread().getName()+"..."+x); 
	   }
   }
}
