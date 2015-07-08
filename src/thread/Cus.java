/*
 * 需求：
 * 银行有一个金库。
 * 有两个储户分别存300元，每次存100，一共存3次
 * 目的：改程序是否有安全问题，如果有，如何解决？
 * 如何找问题：
 * 1、明确哪些代码是多线程运行代码。
 * 
 * 2、明确共享数据
 * 3、明确多线程运行代码中哪些语句是操作共享数据的。
 * */
package thread;

public class Cus implements Runnable
{
	
  private Bank b=new Bank();
  //1 
  public void run()
   {
	   for(int x=0;x<3;x++)
	   {
		   b.add(100);
	   }
   }
}
