/*
 * stop �����Ѿ���ʱ ��
 * ���ֹͣ�̣߳�
 * ֻ��һ�֣�run����������
 * �������߳����У����д���ͨ����ѭ���ṹ��
 * 
 * ֻҪ����סѭ�����Ϳ�����run����������Ҳ�����߳̽�����
 * ���������
 * ���̴߳����˶���״̬��
 * �Ͳ����ȡ��ǣ���ô�߳̾Ͳ��������
 * ��û��ָ���ķ�ʽ�ö�����̻߳ظ�������״̬ʱ����ʱ��Ҫ�Զ�����������
 * ǿ�����ָ̻߳�������״̬�����������Ϳ��Բ���������߳̽�����
 * Thread�����ṩ�÷���������interrupt();
 * */
package TB;

public class stopThreadDemo 
{
  public static void main(String []args)
  {
	  stopThread st=new stopThread();
	  Thread t1=new Thread(st);
	  Thread t2=new Thread(st);
      t1.start();
      t2.start();
      int num=0;
      while(true)
      {
    	  if(num++ ==60)
    	  {
    		 //  st.changeFlag();
    		  t1.interrupt();
    		  break;
    	  }
    	  System.out.println(Thread.currentThread().getName()+"......."+num);
      }
      System.out.println("Over!");
  }
}
