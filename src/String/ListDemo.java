/*
 * Collectyion
 *     !--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
 *         ��--ArrayList:�ײ�����ݽṹʹ�õ�������ṹ���ص����ڲ�ѯ�ٶȺܿ졣������ɾ�������̲߳�ͬ����
 *         !--LinkedList:�ײ�ʹ�õ����������ݽṹ���ص㣺��ɾ�ٶȺܿ죬��ѯ������
 *         !--Vector:�ײ�ʹ�õ����������ݽṹ���߳�ͬ������ArrayList����ˡ�
 *         
 *         
 *     !--Set:Ԫ��������Ԫ�ز������ظ���
 *List:
 *     ���з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ�����
 *��
 *    add(index,element);
 *    addAll(index,Collection);
 *ɾ
 *    remove(index);
 *    
 *��
 *    set(index,element);
 *��           
 *    get(index);
 *    sublist(from,to);
 *    ListIterator listIterator();
 *    
 *    List�������еĵ�������ListIterator��Iterator���ӽӿڡ�
 * **/

package String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo {
	public static void method()
	{
		 ArrayList<String> a1=new ArrayList<String>();
		  //���Ԫ��
		  a1.add("java01");
		  a1.add("java02");
		  a1.add("java03");
		  sop("ԭ������:"+a1);
		  //��ָ��λ�����Ԫ�ء�
		  a1.add(1,"java09");
		  sop(a1);
		  //ɾ��ָ��λ�õ�Ԫ��
		  //a1.remove(2);
		  //sop(a1);
		  //�޸�Ԫ��
		  a1.set(2,"java007");
		  sop(a1);
		  //ͨ���Ǳ��ȡԪ��
		 // sop("a1.get()="+a1.get(1));
		  for(int x=0;x<a1.size();x++)
		  {
			  sop("a1("+x+")="+a1.get(x));
		  }
	      //������
		  Iterator it=a1.iterator();
		  while(it.hasNext())
		  {
			  sop("next:"+it.next());
		  }
		  //ͨIndexOf ��ȡ�����λ��
		  sop("index="+a1.indexOf("java02"));
		  List sub=a1.subList(1, 3);
		  sop("sub="+sub);
		  
	}
  public static void main(String []args)
  {
	 
	  method();
	  
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
}
