package Single;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo2 {
	public static void main(String []args)
	{
		TreeSet<String> ts=new TreeSet<String>(new LenComparator());
		ts.add("abcd");
		ts.add("cc");
		ts.add("cba");
		ts.add("aaa");
		ts.add("z");
		ts.add("hhahaha");
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			sop(s);
		}
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
