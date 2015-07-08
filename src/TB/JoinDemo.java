/*
 * Join:
 * 当A线程执行到了B线程。Join()方法时，A就会等待。等B线程都执行完，A才会执行。
 * join可以用来临时加入线程执行.
 * */
package TB;

public class JoinDemo {
  public static void main(String []args) throws InterruptedException
  {
	 Demo d=new Demo();
	 Thread t1=new Thread(d);
	 Thread t2=new Thread(d); 
	 t1.start();
	 
	 t2.start();
	 t1.join();//join 抢夺CPU的执行权
	 for(int x=0;x<80;x++)
	 {
		 System.out.println("main..."+x);
		 
	 }
	 System.out.println("over");
  }
}