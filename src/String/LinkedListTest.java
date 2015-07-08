/*
 * 使用LinkedList模拟一个堆栈或者队列数据结构。
 * 
 * 堆栈:先进后出。如同一个杯子。
 * 队列:先进先出。如同一个水管。
 * */
package String;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
       Sqeue sq=new Sqeue();
       sq.add("java01");
       sq.add("java02");
       sq.add("java03");
       sq.add("java04");
       while(!sq.isEmpty())
       {
       sop(sq.get());
       }

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
