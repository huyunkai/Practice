/*
 * 每句就是Vector特有的取出方式。
 * 枚举跟迭代器很类似。
 * 其实枚举和迭代是一样的，
 * 因为枚举的名称以及方法的名称过长所以被迭代器取代了。
 * 枚举就结束了。
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
