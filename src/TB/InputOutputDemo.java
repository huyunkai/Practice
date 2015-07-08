/*
 * 等待唤醒机制
 * wait:
 * notify():
 * notifyAll():
 * 都使用在同步中，因为要对持有监视器(锁)的线程操作。
 * 所以要使用在同步中，因为只有同步才具有锁。
 * 
 * 为什么这些操作线程的方法要定义Object类中呢？
 * 因为这些方法在操作同步中线程时，都必须要标识它们所操作线程只有的锁。
 * 只有同一个锁上的被等待线程，可以被同一个锁上notify唤醒。
 * 不可以对不同锁中的线程进行唤醒。
 * 
 * 也就是说，等待和唤醒必须是同一个锁。
 * 而锁可以是任意对象，所以可以被任意对象调用的方法定义Object类中。
 * */
package TB;

public class InputOutputDemo {
  public static void main(String []args)
  {
	  Resource rs=new Resource();
	  new Thread(new Input(rs)).start();
	  new Thread(new Output(rs)).start();	  
//	  Input in=new Input(rs);
//	  Output out=new Output(rs);
//	  Thread t1=new Thread(in);
//	  Thread t2=new Thread(out);
//	  t1.start();
//	  t2.start();
  }
}
