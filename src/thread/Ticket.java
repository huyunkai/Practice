package thread;
/*
 * ͨ�����������֣���ӡ��0��-1��-2�ȴ�Ʊ��
 * ���߳����г����˰�ȫ���⡣
 * ����ԭ��:
 * ����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ����һ���֣���û��ִ��
 * �꣬��һ���̲߳������ִ�У����¹������ݵĴ���
 * ����취��
 *   �Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���꣬��ִ�й����У������̲߳����Բ���ִ�С�
 * java���ڶ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ��
 * ����ͬ�������
 * synchronized(����)
 * {
 *  ��Ҫ��ͬ���Ĵ��롣
 * }
 * ������ͬ�������������߳̿�����ͬ����ִ�С�
 * û�г��������̼߳�ʹ��ȡcpu��ִ��Ȩ��Ҳ����ȥ����Ϊû�л�ȡ����
 * ���ϵ�������--
 * 1������Ҫ�����������������ϵ��߳�
 * 2�������Ƕ���߳�ʹ��ͬһ������
 * ���뱣֤ͬ����ֻ��һ���߳������С�
 * ͬ�������õ���һ�����أ�
 * ������Ҫ������ã���ô��������һ�������������ã�����this��
 * ����ͬ������ʹ�õ�����this
 * 
 * ͨ���ĳ��������֤
 * 
 * ʹ�������߳�����Ʊ
 * һ���߳�ͬ��������С�
 * һ���߳���ͬ��������
 * ����ִ����Ʊ������
 * ���ͬ����������̬���κ�ʹ�õ�����ʲô�أ�
 * ͨ����֤�����ֲ�����this,��Ϊ��̬�����в����Զ���this.
 * ��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
 * ������class �ö����������Class
 * ��̬��ͬ��������ʹ�õ����Ǹ÷�����������ֽ����ļ�����������class.
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
