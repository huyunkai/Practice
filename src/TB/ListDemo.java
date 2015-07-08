/*
 * List集合特有的迭代器。ListIterator是Iterator的子接口
 * 在迭代时，不可能通过集合对象的方法操作集合中的元素。
 * 因为会发生ConcurrentModificationException异常。
 * 所以，在迭代时，只能用迭代器的放过操作元素，可是Iterator方法是有限的，
 * 只能对元素进行判断，取出，删除的操作。
 * 如果想要其他的操作如添加，修改等，就需要使用期子接口 ，ListIterator
 * 该接口只能通过List集合的ListIterator。
 * */
package TB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
  public static void method()
  {
	  ArrayList a1=new ArrayList();
	   sop("原集合是:"+a1);
	   //通过角标获取元素。
	   sop("get(1):"+a1.get(1));
	   sop(a1);
	   //获取所有元素
	   for(int x=0;x<a1.size();x++)
	   {
		  System.out.println("a1("+x+")="+a1.get(x));
	   }
	   Iterator it=a1.iterator();
	   while(it.hasNext()){
		   {
			   sop("next:"+it.next());
		   }
		   sop("index="+a1.indexOf("java02"));
		   List sub=a1.subList(1, 3);
		   sop("sub="+sub);
	   }
  }
   public static void sop(Object obj)
   {
	   System.out.println(obj);
   }
	public static void main(String []args)
   {
	  //演示列表迭代器。

		  ArrayList a1=new ArrayList();
		   //添加元素
		   a1.add("java01");
		   a1.add("java02");
		   a1.add("java03");
		   sop(a1);
		   ListIterator li=a1.listIterator();
		   sop("hasNext():"+li.hasNext());//迭代后面是否有元素
		   sop("hasPrevious():"+li.hasPrevious());//迭代前面是否有元素
		   while(li.hasNext())
		   {
			   Object obj=li.next();
			   if(obj.equals("java02"))
				   // li.set("java009");
			       li.add("java06");
			  
		   }
		   while(li.hasPrevious())
		   {
			   sop("pre:"+li.previous());
		   }
		   sop("hasNext():"+li.hasNext());//迭代后面是否有元素
		   sop("hasPrevious():"+li.hasPrevious());//迭代前面是否有元素
		   sop(a1);
		   //在迭代过程中，准备添加或者删除元素
//		   Iterator it=a1.iterator();
//		   while(it.hasNext())
//		   {
//			   Object obj=it.next();
//			   if(obj.equals("java02")||obj.equals("java01"))
//				  // a1.add("java02");
//				   it.remove();//将java01和java02的 元素给删除掉
//			   sop("obj="+obj);
//		   }
//		   sop(a1);
   }
}
