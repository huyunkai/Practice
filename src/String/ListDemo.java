/*
 * Collectyion
 *     !--List:元素是有序的，元素可以重复，因为该集合体系有索引。
 *         ！--ArrayList:底层的数据结构使用的是数组结构。特点在于查询速度很快。但是增删稍慢。线程不同步。
 *         !--LinkedList:底层使用的是链表数据结构。特点：增删速度很快，查询稍慢。
 *         !--Vector:底层使用的是数组数据结构。线程同步。被ArrayList替代了。
 *         
 *         
 *     !--Set:元素是无序，元素不可以重复。
 *List:
 *     特有方法。凡是可以操作角标的方法都是该体系特有的方法。
 *增
 *    add(index,element);
 *    addAll(index,Collection);
 *删
 *    remove(index);
 *    
 *改
 *    set(index,element);
 *查           
 *    get(index);
 *    sublist(from,to);
 *    ListIterator listIterator();
 *    
 *    List集合特有的迭代器，ListIterator是Iterator的子接口。
 * **/

package String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo {
	public static void method()
	{
		 ArrayList<String> a1=new ArrayList<String>();
		  //添加元素
		  a1.add("java01");
		  a1.add("java02");
		  a1.add("java03");
		  sop("原集合是:"+a1);
		  //在指定位置添加元素。
		  a1.add(1,"java09");
		  sop(a1);
		  //删除指定位置的元素
		  //a1.remove(2);
		  //sop(a1);
		  //修改元素
		  a1.set(2,"java007");
		  sop(a1);
		  //通过角标获取元素
		 // sop("a1.get()="+a1.get(1));
		  for(int x=0;x<a1.size();x++)
		  {
			  sop("a1("+x+")="+a1.get(x));
		  }
	      //迭代器
		  Iterator it=a1.iterator();
		  while(it.hasNext())
		  {
			  sop("next:"+it.next());
		  }
		  //通IndexOf 获取对象的位置
		  sop("index="+a1.indexOf("java02"));
		  List sub=a1.subList(1, 3);
		  sop("sub="+sub);
		  
	}
  public static void main(String []args)
  {
	 
	  method();
	  
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
}
