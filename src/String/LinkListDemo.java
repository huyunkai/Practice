/*
 * LinkedList :特有方法
 * addFirst();
 * addLast();
 *  
 * getFirst();
 * getLast();
 * 获取元素，但不删除元素
 * removeFirst();
 * removeLast();
 * 获取元素，单删除元素。如果集合中没有元素，会出现NoSuchElementException.
 *    
 *    
 * 在JDK1.6
 * OfferFirst();
 * OfferLast();
 * 
 * peekFirst();
 * peekLast();
 * 获取元素，但不删除元素，如果集合中没有元素，返回null.
 * pollFirst();
 * pollLast();
 * 获取元素，但是元素被删除，如果集合中没有元素，返回null.
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
			
		}//取出所有元素 但不实用迭代器。
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
