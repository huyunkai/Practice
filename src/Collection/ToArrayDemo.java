/*
 *Collection接口中的ToArray方法。
 * */
package Collection;

import java.util.ArrayList;

public class ToArrayDemo {
	public static void main(String []args)
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("abc");
		a1.add("efg");
		a1.add("hij");
		/*
		 * 1,指定类型的数组到底要定义多长呢？
		 * 当指定类型的数组长度小于了集合的size,那么该方法内部会创建一个新的数组长度为集合的size.
		 * 当指定类型的长度大于了集合的size,就不会新创建数组，而是使用传递进来的数组。
		 * 所以创建一个刚刚好的数组最优。
		 * 2，为什么要将集合变数组？
		 * 为了限制对元素的操作。不需要进行增删了。
		 * 
		 * 
		 * 
		 * */
		String []arr=a1.toArray(new String[a1.size()]);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
