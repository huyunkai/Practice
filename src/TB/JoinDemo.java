/*
 * Join:
 * ��A�߳�ִ�е���B�̡߳�Join()����ʱ��A�ͻ�ȴ�����B�̶߳�ִ���꣬A�Ż�ִ�С�
 * join����������ʱ�����߳�ִ��.
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
	 t1.join();//join ����CPU��ִ��Ȩ
	 for(int x=0;x<80;x++)
	 {
		 System.out.println("main..."+x);
		 
	 }
	 System.out.println("over");
  }
}