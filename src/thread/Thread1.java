/**
 * 练习：
 * 创建两个线程，和主线程交替运行 
 * 原来线程都有自己默认的名称.
 * Thread--编号 该编号从0开始
 * static Thread currentThread():获取当前线程对象
 * getName()：获取线程名称.
 * 设置线程名称：setName或者构造函数。
 
 * */
package thread;

public class Thread1 extends Thread{
	private String name;
	public Thread1(String n)
	{
		super(n);
	}
   public void run()
   {
	   for(int x=0;x<40;x++)
	   {
		   System.out.println((Thread.currentThread()==this)+"..,"+this.getName()+"  "+"the mian Thread is run..."+x);
	   }
   }
}
