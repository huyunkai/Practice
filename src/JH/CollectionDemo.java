/*
 *add 方法的参数类型是Object,以便于接收任意类型对象
 *2，集合中存储的都是对象的引用(地址)。
 *什么是迭代器呢？
 *其实就是集合的取出元素的方式。
 * */
package JH;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
  public static void main(String []args)
  {
	 method_get();
  }
  public static void method_get()
  {
	//创建一个集合容器，使用Collection接口的子类.ArratList
	  ArrayList<String> a1=new ArrayList<String>();
	  //1.添加元素
	  a1.add("java01");
	  a1.add("java02");
	  a1.add("java03");
	  a1.add("java04");
	  
	  
	  Iterator it=a1.iterator();
	  while(it.hasNext())
	  {
	  sop(it.next());
	  }
	  }
  public static void method_2()
  {
	//创建一个集合容器，使用Collection接口的子类.ArratList
	  ArrayList<String> a1=new ArrayList<String>();
	  //1.添加元素
	  a1.add("java01");
	  a1.add("java02");
	  a1.add("java03");
	  a1.add("java04");
	//创建一个集合容器，使用Collection接口的子类.ArratList
	  ArrayList<String> a2=new ArrayList<String>();
	  //1.添加元素
	  a2.add("java01");
	  a2.add("java02");
	  a2.add("java05");
	  a2.add("java06");
	  //取交集
	  //a1.retainAll(a2);//取交集,a1中只会保留和a2相同的元素。
	  //sop("a1:"+a1);
	  //sop("a2:"+a2);
	  a1.removeAll(a2);//删除a1和a2中相同的元素。
	  sop("a1:"+a1);
	  sop("a2:"+a2);
  }
  public static void base_method()
  {
	  //创建一个集合容器，使用Collection接口的子类.ArratList
	  ArrayList<String> a1=new ArrayList<String>();
	  //1.添加元素
	  a1.add("java01");
	  a1.add("java02");
	  a1.add("java03");
	  a1.add("java04");
	    //打印集合
	    sop("原集合："+a1);
	    
	   //2 ,获取个数，集合长度。
	  //sop("size= :"+a1.size());
	  //3，删除元素
	    a1.remove("java02");
	    //a1.clear();//清空集合
	    //打印改变后的集合
	    sop(a1);
	    //4，判断元素
	    sop("java03是否存在:"+a1.contains("java03"));
	    sop("集合是否为空?:"+a1.isEmpty());
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
  
}
