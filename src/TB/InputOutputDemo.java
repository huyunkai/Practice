/*
 * �ȴ����ѻ���
 * wait:
 * notify():
 * notifyAll():
 * ��ʹ����ͬ���У���ΪҪ�Գ��м�����(��)���̲߳�����
 * ����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�������
 * 
 * Ϊʲô��Щ�����̵߳ķ���Ҫ����Object�����أ�
 * ��Ϊ��Щ�����ڲ���ͬ�����߳�ʱ��������Ҫ��ʶ�����������߳�ֻ�е�����
 * ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ������notify���ѡ�
 * �����ԶԲ�ͬ���е��߳̽��л��ѡ�
 * 
 * Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������
 * ��������������������Կ��Ա����������õķ�������Object���С�
 * */
package TB;

public class InputOutputDemo {
  public static void main(String []args)
  {
	  Resource rs=new Resource();
	  new Thread(new Input(rs)).start();
	  new Thread(new Output(rs)).start();	  
//	  Input in=new Input(rs);
//	  Output out=new Output(rs);
//	  Thread t1=new Thread(in);
//	  Thread t2=new Thread(out);
//	  t1.start();
//	  t2.start();
  }
}
