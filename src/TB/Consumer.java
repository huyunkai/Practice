package TB;

public class Consumer implements Runnable
{
 private Res res;
 Consumer(Res res)
 {
	 this.res=res;
 }
 public void run()
 {
	 while(true)
	 {
		 res.out();;
	 }
 }
}
