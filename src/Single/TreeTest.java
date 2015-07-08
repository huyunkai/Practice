/*
 * 练习：按照字符串长度排序。
 * 字符创本身具备比较性，但是它的比较方式不是所需要的。
 * 这时就只能使用比较器。
 * */
package Single;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeTest {
	public static void main(String  []args)
	{
		TreeSet ts=new TreeSet(new StringLengthComparator());
		ts.add("abcd");
		ts.add("cc");
		ts.add("cba");
		ts.add("z");
		ts.add("hahahs");
		ts.add("gotoghert");
		ts.add("aotoghert");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
		sop(it.next());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
