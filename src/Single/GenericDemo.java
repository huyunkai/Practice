/*
 * 泛型：JDK1.5版本以后出现新特性。用于解决安全问题，是一个类型安全机制。
 * 好处：
 * 1.将运行时期出现问题ClassCastException，转移到了编译时期。
 * 方便于程序员解决问题，让运行市区问题减少，解决安全问题。
 * 2.避免了强制转换麻烦。
 * 泛型格式：通过<>来定义要操作的引用数据类型。
 * 在使用java提供的对象时，什么时候写泛型呢？
 * 通常在集合框架中很常见。
 * 只要见到<>就要定义泛型。
 * 其实<>就是用来接收类型的。
 * 当使用集合时，将集合中要存储的数据类型作为参数传递到<>中即可。
 * 
 * */
package Single;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String []args)
	{
		
		ArrayList<String> a1=new ArrayList<String>();//定义一个ArrayList容器这容器存放的元素是String类型。
		a1.add("abc01");
		a1.add("abc022");
		a1.add("abc0112");
		a1.add(new Integer(4).toString());
		Iterator<String> it=a1.iterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			sop(s+":"+s.length());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
