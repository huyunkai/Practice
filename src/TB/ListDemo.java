/*
 * List�������еĵ�������ListIterator��Iterator���ӽӿ�
 * �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�ء�
 * ��Ϊ�ᷢ��ConcurrentModificationException�쳣��
 * ���ԣ��ڵ���ʱ��ֻ���õ������ķŹ�����Ԫ�أ�����Iterator���������޵ģ�
 * ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ�����
 * �����Ҫ�����Ĳ�������ӣ��޸ĵȣ�����Ҫʹ�����ӽӿ� ��ListIterator
 * �ýӿ�ֻ��ͨ��List���ϵ�ListIterator��
 * */
package TB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
  public static void method()
  {
	  ArrayList a1=new ArrayList();
	   sop("ԭ������:"+a1);
	   //ͨ���Ǳ��ȡԪ�ء�
	   sop("get(1):"+a1.get(1));
	   sop(a1);
	   //��ȡ����Ԫ��
	   for(int x=0;x<a1.size();x++)
	   {
		  System.out.println("a1("+x+")="+a1.get(x));
	   }
	   Iterator it=a1.iterator();
	   while(it.hasNext()){
		   {
			   sop("next:"+it.next());
		   }
		   sop("index="+a1.indexOf("java02"));
		   List sub=a1.subList(1, 3);
		   sop("sub="+sub);
	   }
  }
   public static void sop(Object obj)
   {
	   System.out.println(obj);
   }
	public static void main(String []args)
   {
	  //��ʾ�б��������

		  ArrayList a1=new ArrayList();
		   //���Ԫ��
		   a1.add("java01");
		   a1.add("java02");
		   a1.add("java03");
		   sop(a1);
		   ListIterator li=a1.listIterator();
		   sop("hasNext():"+li.hasNext());//���������Ƿ���Ԫ��
		   sop("hasPrevious():"+li.hasPrevious());//����ǰ���Ƿ���Ԫ��
		   while(li.hasNext())
		   {
			   Object obj=li.next();
			   if(obj.equals("java02"))
				   // li.set("java009");
			       li.add("java06");
			  
		   }
		   while(li.hasPrevious())
		   {
			   sop("pre:"+li.previous());
		   }
		   sop("hasNext():"+li.hasNext());//���������Ƿ���Ԫ��
		   sop("hasPrevious():"+li.hasPrevious());//����ǰ���Ƿ���Ԫ��
		   sop(a1);
		   //�ڵ��������У�׼����ӻ���ɾ��Ԫ��
//		   Iterator it=a1.iterator();
//		   while(it.hasNext())
//		   {
//			   Object obj=it.next();
//			   if(obj.equals("java02")||obj.equals("java01"))
//				  // a1.add("java02");
//				   it.remove();//��java01��java02�� Ԫ�ظ�ɾ����
//			   sop("obj="+obj);
//		   }
//		   sop(a1);
   }
}
