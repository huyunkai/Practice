/*
 * ���󣺼򵥵���Ʊ����
 * �������ͬʱ��Ʊ
 * */
package thread;
/*
 * �����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 * ����
 * 1��������ʵ��Runnable�ӿ�
 * 2������Runnable�ӿ��е�run������
 * ���߳�Ҫ���еĴ����ŵ�run�����С�
 * 3��ͨ��Thread�ཨ���̶߳���
 * 4����Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
 *   ΪʲôRunnable�ӿ�������󴫵ݸ�Thread�Ĺ��캯����
 *   ��Ϊ���Զ����run���������Ķ�����Runnable�ӿڵ��������
 *   ����Ҫ���߳�ȥָ�������run�������ͱ�������ȷ��run���������Ķ���
 * 5������Thread���start���������̱߳�����Runnable�ӿ������run������
 * ʵ�ַ�ʽ�ͼ̳з�ʽ������
 *   ʵ�ַ�ʽ�ô��������˵��̳еľ����ԡ�
 *   �ڶ����߳�ʱ������ʹ��ʵ�ַ�����
 *   ����
 *   �̳�Thread:�̴߳�������Thread����run������
 *   ʵ��Runnable:�̴߳�����ڽӿ������run������
 * */
public class MP {
 public static void main(String []args)
 {
     Ticket t=new Ticket();
//	 Ticket t2=new Ticket();
//	 Ticket t3=new Ticket();
//	 Ticket t4=new Ticket();a
	Thread t1=new Thread (t);//����һ���߳�
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
