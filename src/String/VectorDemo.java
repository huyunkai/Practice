/*
 * ÿ�����Vector���е�ȡ����ʽ��
 * ö�ٸ������������ơ�
 * ��ʵö�ٺ͵�����һ���ģ�
 * ��Ϊö�ٵ������Լ����������ƹ������Ա�������ȡ���ˡ�
 * ö�پͽ����ˡ�
 * */
package String;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
		Enumeration en=v.elements();
		while(en.hasMoreElements())
		{
			sop(en.nextElement());
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
