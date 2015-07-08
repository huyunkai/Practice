package thread;
/*
 * 通过分析，发现，打印出0，-1，-2等错票。
 * 多线程运行出现了安全问题。
 * 问题原因:
 * 当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行
 * 完，另一个线程参与进来执行，导致共享数据的错误。
 * 解决办法：
 *   对多条操作共享数据的语句，只能让一个线程都执行完，在执行过程中，其他线程不可以参与执行。
 * java对于多线程的安全问题提供了专业的解决方式。
 * 就是同步代码块
 * synchronized(对象)
 * {
 *  需要被同步的代码。
 * }
 * 对象如同锁，持有锁的线程可以在同步中执行。
 * 没有持有锁的线程即使获取cpu的执行权，也进不去，因为没有获取锁。
 * 火车上的卫生间--
 * 1、必须要有两个或者两个以上的线程
 * 2、必须是多个线程使用同一个锁。
 * 必须保证同步中只有一个线程在运行。
 * 同步函数用的哪一个锁呢？
 * 函数需要对象调用，那么函数都有一个所属对象引用，就是this。
 * 所有同步函数使用的锁是this
 * 
 * 通过改程序进行验证
 * 
 * 使用两个线程来买票
 * 一个线程同步代码块中。
 * 一个线程在同步函数中
 * 都在执行买票动作。
 * 如果同步函数被静态修饰后，使用的锁是什么呢？
 * 通过验证：发现不再是this,因为静态方法中不可以定义this.
 * 静态进内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象
 * 类名：class 该对象的类型是Class
 * 静态的同步方法：使用的锁是该方法所在类的字节码文件对象，类名。class.
 * */

public class Ticket implements Runnable{
  private static  int tick=100;
  Object obj=new Object();
  boolean flag=true;
  public void run()
  {
	if(flag){	
	  while(true)
	  {
		  synchronized (Ticket.class) {
			  if(tick>0)
			  {
				  try
				  {
					  Thread.sleep(10);
				  } 
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }
				  System.out.println(Thread.currentThread().getName()+"..."+"code :"+tick--);
			  }
		  
		}
	  }
		 
}
	else 
		while(true)
			show();
  }
	public static synchronized void show()
	{
		  if(tick>0)
		  {
			  try
			  {
				  Thread.sleep(10);
			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			  System.out.println(Thread.currentThread().getName()+"..."+"show :"+tick--);
		  }
	}
}
