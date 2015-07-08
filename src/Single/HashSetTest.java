/*
 * 往HashSet集合中存入自定对象。
 * 姓名和年龄相同为同一个重复元素。
 * 
 * */
package Single;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
  public static void main(String []args)
  {
	  HashSet hs=new HashSet();
	  hs.add(new Person("a1",11));
	  hs.add(new Person("a2",12));
	  hs.add(new Person("a3",13));
	  hs.add(new Person("a4",14));
	  hs.add(new Person("a2",12));
	  hs.add(new Person("a4",14));
	  hs=singleHashSet(hs);
	  Iterator it=hs.iterator();
	  while(it.hasNext())
	  {
		  Person p=(Person)it.next();
		  sop(p.getName()+"..."+p.getAge());  
	  }
	  
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
  public static HashSet singleHashSet(HashSet hs)
  {
	  HashSet newhs=new HashSet();
	  Iterator it=hs.iterator();
	  while(it.hasNext())
	  {
		  Object obj=it.next();
		  if(!(newhs.contains(obj)))
		  {
			  newhs.add(obj);
		  }
	  }
	  return newhs;
  }
}
