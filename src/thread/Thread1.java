/**
 * ��ϰ��
 * ���������̣߳������߳̽������� 
 * ԭ���̶߳����Լ�Ĭ�ϵ�����.
 * Thread--��� �ñ�Ŵ�0��ʼ
 * static Thread currentThread():��ȡ��ǰ�̶߳���
 * getName()����ȡ�߳�����.
 * �����߳����ƣ�setName���߹��캯����
 
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
