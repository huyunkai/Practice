/*
 * 需求：对学生对象的年龄进行升序排序。
 * 因为数据是以键值对行事存在的。
 * 所以要使用可以排序的map集合，TreeMap;
 * */
package Map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String []args)
	{
		TreeMap<Student, String>tm=new TreeMap<Student, String>(new StuNameComparator());
		tm.put(new Student("lisi01", 12),"heibei");
		tm.put(new Student("lisi033", 22),"liuyang");
		tm.put(new Student("lisi022", 17),"beijing");
		tm.put(new Student("lisi011", 13),"nanjing");
		Set<Map.Entry<Student,String>>entrySet1=tm.entrySet();
		Iterator<Map.Entry<Student, String>>it=entrySet1.iterator();
		while(it.hasNext())
		{
			Map.Entry<Student, String>mp=it.next();
			Student stu=mp.getKey();
			String addr=mp.getValue();
			sop("student:"+stu+",addr:"+addr);
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
