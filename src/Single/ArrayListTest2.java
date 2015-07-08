/*
 * 将自定义对象作为元素存储到ArrayList集合中，并去除重复元素。
 * 如：人
 * 同姓名同年龄视为重复元素。
 * 思路：
 * 1,对人描述，将数据封装如对象。
 * 2，定义容器，将人存入。
 * 3，取出。
 * List集合判断元素是否相同，依据的是元素的Equals方法是否相同。
 * 
 * */
package Single;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		 ArrayList a1=new ArrayList();
		 a1.add(new Person("阿三",20));//a1.add(Object obj);
		 a1.add(new Person("lisi01",20));
		 a1.add(new Person("lisi02",20));
		 a1.add(new Person("lisi03",20));
		 a1.add(new Person("lisi04",20));
//		 a1.add(new Person("lisi01",20));
//		 a1.add(new Person("lisi02",20));
//		 a1.add(new Person("lisi03",20));
//		 a1.add(new Person("lisi04",20));
		//a1=singleElemets(a1);
		 sop("remove 04:"+ a1.remove(new Person("lisi04",20)));
		 Iterator it=a1.iterator();
		 while(it.hasNext())
		 {
			 Person p=(Person)it.next();
			 sop(p.getName()+"..."+p.getAge());
//			 singleElemets(a1);
//			 sop(p.getName()+"..."+p.getAge());
		 }

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	//取出重复元素
	public static ArrayList singleElemets(ArrayList a1)
	{
		ArrayList new1=new ArrayList();
		Iterator it=a1.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(!new1.contains(obj))//调用contains方法，自动调用底层的equals方法。
			{
				new1.add(obj);
			}
		}
		return new1;
	}

}
