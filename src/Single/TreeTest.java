/*
 * ��ϰ�������ַ�����������
 * �ַ�������߱��Ƚ��ԣ��������ıȽϷ�ʽ��������Ҫ�ġ�
 * ��ʱ��ֻ��ʹ�ñȽ�����
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
