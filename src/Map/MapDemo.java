/*
 * Map集合:该集合存储键值对。一堆一堆往里存。而且要保证键的唯一性。
 * 1，添加。
 * 	put(K key,V value);
 *  putAll(Map<? extends K,? extends V>n);
 * 2，删除。
 * 	clear();
 * 	remove(Object key);
 * 3，判断。
 * 	containsValue(Object value);
 * 	containsKey(Object key);
 *  isEmpty();
 * 4，获取。
 * 	get(Object key);
 * 	size();
 * 	values();
 * Map
 * 	！--Hashtable:底层是哈希表数据结构，不可以存入null键null值。该集合是线程同步的。jdk1.0效率低
 * 	！--HashMap:底层是哈希表数据结构，允许使用null值和null键，该集合时不同步的。jdk1.2效率高
 * 	！--TreeMap:底层是二叉树数据结构，线程不同步。可以用于给map集合中的键进行排序。
 * 和Set很像。
 * 其实Set底层就是使用了Map集合。
 * 
 * **/
package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
	public static void main(String []args)
	{
//		HashMap<Integer, String>hashMap=new HashMap<Integer, String>();
//		hashMap.put(1, "lisi01");
//		hashMap.put(2, "lisi02");
//		hashMap.put(3, "lisi03");
//		hashMap.put(4, "lisi04");
//		hashMap.put(5, "lisi05");
//		hashMap.put(6, "lisi06");
//		sop(hashMap);
//		HashMap<Integer, String>hashMap1=new HashMap<Integer, String>();
//		hashMap1.put(7, "lisi07");
//		hashMap1.put(8, "lisi08");
//		hashMap1.put(9, "lisi09");
//		hashMap1.putAll(hashMap);
//		Iterator it=hashMap1.entrySet().iterator();//entrySet将map转换为set类型。
//		while(it.hasNext())
//		{
//		sop(it.next());
//		}
		Map<String, String>map=new HashMap<String, String>();
		//添加元素,添加元素，如果出现添加时，相同的键，那么后添加的值会覆盖原有键对应值。并put方法会返回被覆盖原有键对应值。
		sop("put:"+map.put("01","张三1"));
		sop("put:"+map.put("01","wanglu"));
		map.put("02","张三2");
		map.put("03","张三3");
		map.put("04","张三4");
//		sop("containsKey:"+map.containsKey("01"));
//		sop("containsKey:"+map.containsKey("011"));
//		sop("remove:"+map.remove("02"));
//		sop(map);
		sop("get:"+map.get("02"));
		map.put("05", null);
		sop("get:"+map.get("05"));
		//可以通过get方法的返回值来判断一个键是否存在。通过返回null来判断
		
		//获取map集合中所有的值。
		Collection<String>coll=map.values();
		Iterator it=coll.iterator();
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
