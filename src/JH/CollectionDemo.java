/*
 *add �����Ĳ���������Object,�Ա��ڽ����������Ͷ���
 *2�������д洢�Ķ��Ƕ��������(��ַ)��
 *ʲô�ǵ������أ�
 *��ʵ���Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ��
 * */
package JH;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
  public static void main(String []args)
  {
	 method_get();
  }
  public static void method_get()
  {
	//����һ������������ʹ��Collection�ӿڵ�����.ArratList
	  ArrayList<String> a1=new ArrayList<String>();
	  //1.���Ԫ��
	  a1.add("java01");
	  a1.add("java02");
	  a1.add("java03");
	  a1.add("java04");
	  
	  
	  Iterator it=a1.iterator();
	  while(it.hasNext())
	  {
	  sop(it.next());
	  }
	  }
  public static void method_2()
  {
	//����һ������������ʹ��Collection�ӿڵ�����.ArratList
	  ArrayList<String> a1=new ArrayList<String>();
	  //1.���Ԫ��
	  a1.add("java01");
	  a1.add("java02");
	  a1.add("java03");
	  a1.add("java04");
	//����һ������������ʹ��Collection�ӿڵ�����.ArratList
	  ArrayList<String> a2=new ArrayList<String>();
	  //1.���Ԫ��
	  a2.add("java01");
	  a2.add("java02");
	  a2.add("java05");
	  a2.add("java06");
	  //ȡ����
	  //a1.retainAll(a2);//ȡ����,a1��ֻ�ᱣ����a2��ͬ��Ԫ�ء�
	  //sop("a1:"+a1);
	  //sop("a2:"+a2);
	  a1.removeAll(a2);//ɾ��a1��a2����ͬ��Ԫ�ء�
	  sop("a1:"+a1);
	  sop("a2:"+a2);
  }
  public static void base_method()
  {
	  //����һ������������ʹ��Collection�ӿڵ�����.ArratList
	  ArrayList<String> a1=new ArrayList<String>();
	  //1.���Ԫ��
	  a1.add("java01");
	  a1.add("java02");
	  a1.add("java03");
	  a1.add("java04");
	    //��ӡ����
	    sop("ԭ���ϣ�"+a1);
	    
	   //2 ,��ȡ���������ϳ��ȡ�
	  //sop("size= :"+a1.size());
	  //3��ɾ��Ԫ��
	    a1.remove("java02");
	    //a1.clear();//��ռ���
	    //��ӡ�ı��ļ���
	    sop(a1);
	    //4���ж�Ԫ��
	    sop("java03�Ƿ����:"+a1.contains("java03"));
	    sop("�����Ƿ�Ϊ��?:"+a1.isEmpty());
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
  
}
