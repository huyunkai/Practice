/*
 * ʹ��LinkedListģ��һ����ջ���߶������ݽṹ��
 * 
 * ��ջ:�Ƚ��������ͬһ�����ӡ�
 * ����:�Ƚ��ȳ�����ͬһ��ˮ�ܡ�
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
