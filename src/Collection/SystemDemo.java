/**
 * System:
 * 描述系统一些信息。
 * 获取系统属性信息：Properties getProperties();
 * 
 * */
package Collection;

import java.util.Properties;

public class SystemDemo {
	public static void main(String []args)
	{
		Properties prop=System.getProperties();
		//因为Properties是Hashable的子类，也就是Map集合的一个子类对象。
		//那么可以通过Map的方法取出该集合中的元素。
		
		System.out.println(prop);
	}
}
