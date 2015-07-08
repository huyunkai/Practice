package thread;

public class Bank {
 private int sum;
 Object obj=new Object();
 //1
 public  synchronized void add(int n) 
 { 
//	 synchronized (obj) {
		 sum+=n;
		 try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("sum="+sum);
	 }
	 }
		
//	}

