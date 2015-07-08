/*
 * 泛型：JDK1.5版本以后出现新特性。用于解决安全问题，是一个安全机制。
 * 好处：
 * 1、将运行时期出现问题ClassException，转移到了编译时期。
 * 方便于程序员解决问题。让运行时期问题减少安全
 * 2、避免了强制转换的麻烦。
 * */
package TB;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
  public static void main(String []args)
  {
	  ArrayList<String> a1=new ArrayList<String>();//String类型的集合定义时直接定义数据类型
	  a1.add("abc01");
	  a1.add("abc02");
	  a1.add("abc03");
	  Iterator<String> it=a1.iterator();
	  while(it.hasNext())
	  {
		  //打印元素的长度
		  String s=it.next();
		  System.out.println(s+":"+s.length());
	  }
  }
}
