/*
 * 当元素自身不具备比较性，或者具备的比较性不是所需要的。
 * 这时需要让容器自身具备比较性。
 * 定义了比较器，将比较器对象作为参数传递给TreeSet集合的构造函数。
 * 当两种排序都存在时，以比较器为主。
 * 
 * 定义一个类，实现comparator接口，覆盖compare方法。
 * **/

package Single;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String []args)
	{
		@SuppressWarnings("unchecked")
		TreeSet<Student> ts=new TreeSet<Student>(new MyCompare());
		ts.add(new Student("lisi01",20));
		ts.add(new Student("lisi02",21));
		ts.add(new Student("lisi03",22));
		ts.add(new Student("lisi04",23));
		ts.add(new Student("lisi05",16));
		ts.add(new Student("lisi06",15));
		ts.add(new Student("lisi06",15));
		ts.add(new Student("lisi06",16));
		ts.add(new Student("lisi06",17));
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			Student st=(Student)it.next();
			sop(st.getName()+"...."+st.getAge());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
