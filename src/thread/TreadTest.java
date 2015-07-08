/**
 * 进程：是一个正在执行中的程序.

 * 每一个进程执行都有一个执行顺序，该顺序是一个执行路径，或者一个控制单元。
 * 线程：就是进程中的一个独立的控制单元.
 *     线程再控制着进程的执行。
 * 一个进程中至少有一个线程。
 * JV 启动的时候会有一个进程java。exe
 * 该进程中至少一个进程负责java程序的执行
 * 而且这个线程运行的代码存在于main方法中。
 * 该线程称之为主线程。
 * 
 * 扩展：其实更细节说明jvm，jvm启动不知一个线程。还有负责垃圾回收机制的线程。
 *1、如何在自定义代码中，自定义一个线程？
 *通过对API的查找，java已经提供了对线程这类事物的描述就是THread
 *创建线程的第一种方式：继承Thread类
 * 步骤：
 * 1、定义类继承Thread
 * 2、复写Thread类中的run方法。
 * 目的：将自定义带按摩存储在run方法,让线程运行，
 * 3、调用线程的start方法，该方法两个作用：线程。
 * 每次运行结果都不同
 * 因为多个线程都在获取cpu的执行权，CUP执行到谁，谁就运行。
 * 明确一点，在某一时刻，只能有一个程序在运行。多和除外。
 * cpu在做着快速的切换，以达到看上去是同时运行的效果
 * 我们可以形象的把多线程的运行形容为在互相抢夺cpu的执行权
 * 这就是多线程的一个特性：随机性。谁抢到谁执行，至于执行多长时间，cpu说的算。
 * 为什么要覆盖run方法呢？
 * Thread类用于描述线程
 * 该类就定义了一个功能，用云存储线程要运行的代码，改存储功能就是run方法。
 * 也就是说Thread类中的run方法是用于存储线程要运行的代码。
 * 
 * 
 * */
package thread;
class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		System.out.println("Demo run!---"+i);
	}
}



public class TreadTest  extends Thread{
  public  static void main(String []args)
  { 
	  Demo d=new Demo();//创建好一个线程。
	  d.start();//开启线程并执行该线程的run方法
	  d.run();//仅仅是对象调用方法。而线程创建了，并没有运行。
	  for(int i=0;i<20;i++)
		  System.out.println("Hello World!---"+i);
//     Thread  d1=new Thread(new Runnable() {
//		
//		@Override
//		public void run() {
//			System.out.println("Hello world!");
//			
//		}
//	});
//     d1.start();
  }
}
