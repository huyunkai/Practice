/*
 * ���ڶ�������ߺ������ߡ�
 * ΪʲôҪ����while�жϱ�ǡ�
 * ԭ���ñ����ѵ��߳���һ���жϱ�ǡ�
 * 
 * Ϊʲô����notifyall,
 * ��Ϊ��Ҫ���Ѷ����̡߳�
 * ��Ϊֻ��notify�����׳���ֻ���ѱ����̵߳���������³����е������̶߳��ȴ���
 * */
package TB;

public class ProducterConstumerDemo {
   public static void main(String []args)
   {
	    Res res=new Res();
	   Producer p=new Producer(res);
	   Consumer c=new Consumer(res);
	   Thread t1=new Thread(p);
	   Thread t2=new Thread(p);
	   Thread t3=new Thread(c);
	   Thread t4=new Thread(c); 
	   t1.start();
	   t2.start();
	   t3.start();
	   t4.start();
   }
}
