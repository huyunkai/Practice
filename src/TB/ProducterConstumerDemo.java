/*
 * 对于多个生产者和消费者。
 * 为什么要定义while判断标记。
 * 原因：让被唤醒的线程再一次判断标记。
 * 
 * 为什么定义notifyall,
 * 因为需要唤醒对象线程。
 * 因为只用notify，容易出现只唤醒本方线程的情况。导致程序中的所有线程都等待。
 * */
package TB;

public class ProducterConstumerDemo {
   public static void main(String []args)
   {
	    Res res=new Res();
	   Producer p=new Producer(res);
	   Consumer c=new Consumer(res);
	   Thread t1=new Thread(p);
	   Thread t2=new Thread(p);
	   Thread t3=new Thread(c);
	   Thread t4=new Thread(c); 
	   t1.start();
	   t2.start();
	   t3.start();
	   t4.start();
   }
}
