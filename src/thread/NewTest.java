package thread;


public class NewTest {
  public static void main(String []args)
  {
	  Thread1 t1=new Thread1("one");
	  Thread1 t2=new Thread1("two");
//	  t1.start();
	  t2.start();
	  t1.run();
//	  t2.run();
	  for(int i=0;i<40;i++)
	  {
		  System.out.println("new is run.."+i);
	  }
  }
}
