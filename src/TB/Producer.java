package TB;

public class Producer implements Runnable{
   private Res res;
   Producer(Res res)
   {
	   this.res=res;
   }
   public void run()
   {
	   while(true)
	   {
		   res.set("…Ã∆∑");
		   
	   }
   }
}
