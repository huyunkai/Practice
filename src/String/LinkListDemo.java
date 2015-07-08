/*
 * LinkedList :���з���
 * addFirst();
 * addLast();
 *  
 * getFirst();
 * getLast();
 * ��ȡԪ�أ�����ɾ��Ԫ��
 * removeFirst();
 * removeLast();
 * ��ȡԪ�أ���ɾ��Ԫ�ء����������û��Ԫ�أ������NoSuchElementException.
 *    
 *    
 * ��JDK1.6
 * OfferFirst();
 * OfferLast();
 * 
 * peekFirst();
 * peekLast();
 * ��ȡԪ�أ�����ɾ��Ԫ�أ����������û��Ԫ�أ�����null.
 * pollFirst();
 * pollLast();
 * ��ȡԪ�أ�����Ԫ�ر�ɾ�������������û��Ԫ�أ�����null.
 * */
package String;

import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String []args)
	{
		LinkedList link=new LinkedList();
		link.addLast("java01");
		link.addLast("java02");
		link.addLast("java03");
		link.addLast("java04");
		//sop(link);
//		sop(link.getFirst());
//		sop(link.getLast());
//		sop("size="+link.size());
//		sop(link.removeFirst());
//		sop("size="+link.size());
		while(true)
		{
			sop(link.pollFirst());
			
		}//ȡ������Ԫ�� ����ʵ�õ�������
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
