package thread;

public class BankDemo {
  public static void main(String []args)
  {
	 Cus c=new Cus();
	 Thread t1=new Thread(c);
	 Thread t2=new Thread(c);
	 t1.start();
	 t2.start();
  }
}
