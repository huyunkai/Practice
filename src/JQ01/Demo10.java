/*
 * 使用泛型时的几个常见问题.
 * 使用泛型时必须是引用类型，而不能是基本数据类型.
 * 三种基本的注释:
 * @Override:限定重写父类方法,该注释只能用于方法.
 * @Deprecated:用于表示某个程序元素(类,方法等)已过时.
 * @SuppressWarnings:抑制编译器警告.
 * */
package JQ01;

import java.util.ArrayList;
import java.util.List;

public class Demo10 
{
	public static void main(String []args)
	{
		//ArrayList <String>list=new ArrayList<Object>();//这种使用方法是错误的.
		//ArrayList<String> list=new ArrayList<String>();
		ArrayList<String>list=new ArrayList<>();
		ArrayList list1=new ArrayList<String>();
		
	}
	public void add(List<? extends Number>list)
	{
			//list.add(100);//只要有？就不能调用与类型相关的方法.
	}
}
