/*
 * System:；类中的方法和属性都是静态的.
 * out:标准输出，默认是控制台。
 * in:标注输入，默认是键盘。
 * 描述系统一些信息： Properties getProperties(); 
 * */
package IO;
import java.util.Properties;
import java.util.Set;

public class SystemDemo {
	public static void main(String []args)
	{
		Properties prop =System.getProperties();
		//因为Properties是Hashtable的子类，也就是Map集合的一个子类对象。
		//那么可以通过map方法取出该集合中的元素
		//该集合中存储都是字符串，没有泛型定义。
		 
		
		
		//如何在系统中自定义一些特有星信息呢？
		
		System.setProperty("mykey", "myvalue");
		//获取指定属性信息。
		String value=System.getProperty("os.name");
		sop("value="+value);
		
		//可不可以在虚拟机启动时动态的加载一些属性信息呢？
		
		String v=System.getProperty("haha");
		sop("v="+v);
		//获取所有属性信息。
		
//		for(Object obj:prop.keySet())
//		{
//			String value=(String)prop.get(obj);
//			//sop(obj+":"+value);
//		}
//		Set<String> key=prop.stringPropertyNames();
//		for(String i:key)
//		{
//			sop(i+"::"+prop.getProperty(i));
//		}
//		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
