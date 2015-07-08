/*
 * 需求：简单的卖票程序
 * 多个窗口同时卖票
 * */
package thread;
/*
 * 创建线程的第二种方式：实现Runnable接口
 * 步骤
 * 1、定义类实现Runnable接口
 * 2、覆盖Runnable接口中的run方法。
 * 将线程要运行的代码存放到run方法中。
 * 3、通过Thread类建立线程对象
 * 4、将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数。
 *   为什么Runnable接口子类对象传递给Thread的构造函数。
 *   因为，自定义的run方法所属的对象是Runnable接口的子类对象。
 *   所以要让线程去指定对象的run方法，就必须明？确改run方法所属的对象。
 * 5、调用Thread类的start方法开启线程兵调用Runnable接口子类的run方法。
 * 实现方式和继承方式的区别？
 *   实现方式好处：避免了单继承的局限性。
 *   在定义线程时，建议使用实现方法。
 *   区别：
 *   继承Thread:线程代码存放在Thread子类run方法中
 *   实现Runnable:线程代码存在接口子类的run方法。
 * */
public class MP {
 public static void main(String []args)
 {
     Ticket t=new Ticket();
//	 Ticket t2=new Ticket();
//	 Ticket t3=new Ticket();
//	 Ticket t4=new Ticket();a
	Thread t1=new Thread (t);//创建一个线程
	Thread t2=new Thread(t);
//	Thread t3=new Thread(t);
//	Thread t4=new Thread(t);
	t1.start();
	try
	{
	
		Thread.sleep(10);
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	t.flag=false;
	t2.start();
//	t3.start();
//	t4.start();
	
 }
}
