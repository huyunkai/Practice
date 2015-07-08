/*
 * ！--Set:元素是无序的(存入和取出的顺序不一定一致)，元素不可以重复.
 *    ！--HashSet:底层数据结构是哈希表。
 *       HashSet是如何保证元素唯一性的呢？
 *       是通过元素的两个方法，HashCode和equals来完成。
 *       如果元素的HashCode值相同，才会判断equals是否为true；
 *       如果元素的Hashcode值不同，不会调用equals.
 *  
 *    !--TreeSet:
 * Set集合的功能和Collection是一致的。
 * 
 * */

package Single;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
//		Person p=new Person("NB",11);
//		Person p1=new Person("NB2",12);
//		sop(p);
//		sop(p1);
		HashSet hs=new HashSet();
		hs.add("java01");
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
