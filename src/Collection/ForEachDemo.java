/*
 * 高级for循环
 * 
 * 格式：
 * for(数据类型  变量名：被变量的集合(Collection)或者数组)
 * {
 * 
 * }
 * 对集合进行遍历。
 * 只能获取元素，但是不能对集合进行操作。
 * 迭代器除了遍历，还可以进行remove集合中元素的动作。
 * 如果使用ListIterator,还可以在遍历过程中对集合进行增删改查的动作。
 * 传统for和高级for有什么区别呢？
 * 高级for有一个局限性。必须有被遍历的目标。
 * 建议在遍历数组的时候，还是建议使用传统for,因为传统for可以定义角标。
 * */
package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachDemo {
	public static void main(String []args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("213");
		list.add("abc");
		list.add("das");
		for(String s:list)
		{
			sop(s);
		}
		int []arr={3,5,1};
		for(int i:arr)
		{
			sop("i:"+i);
		}
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1, "123");
		hm.put(2, "456");
		hm.put(3, "789");
		Set<Map.Entry<Integer, String>> Entry=hm.entrySet();
		for(Map.Entry<Integer, String> me:Entry)
		{
			sop(me.getKey()+":"+me.getValue());
		}
		Set<Integer> keyset=hm.keySet();
		for(Integer i:keyset)
		{
			sop(i+":"+hm.get(i));
		}
//		Iterator it=list.iterator();
//		while(it.hasNext())
//		{
//			sop(it.next());
//		}
//		Map<String,String> list1=new HashMap<String,String>();
//		list1.put("1", "abc");
//		list1.put("2", "123");
//		list1.put("3","sda");
//		Set<Map.Entry<String, String>> entryset=list1.entrySet();
//		Iterator<Map.Entry<String, String>>it=entryset.iterator();
//		while(it.hasNext())
//		{
//			sop(it.next());
//		}
//		Set<String>keySet=list1.keySet();
//		Iterator<String> its=keySet.iterator();
//		while(its.hasNext())
//		{ 
//			String key=its.next();
//			String value=list1.get(key);
//			sop(key+"="+value);
//			}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
