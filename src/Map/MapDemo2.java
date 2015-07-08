/*
 * map集合的两种取出方式：
 * 1，Set<K> KeySet:将map中所有的键存入到Set集合，因为Set具备迭代器，所有可以迭代方式取出
 *   所有的键，再根据get方法，获取每一个键对应的值。
 *   
 *   map集合的取出原理:将map集合转成set集合，再通过迭代器取出。
 * 2,Set<Map.Entry<k,v>> entrySet: 将map集合中的映射关心存入到了set集合中，而这个关系的数据类型就是Map.Entry.
 * Map.Entry 其实Entry也是一个接口，它是map接口中的一个内部接口。
 * */
package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String []args)
	{
		Map<String,String>map=new HashMap<String,String>();
		map.put("01","lisi01");
		map.put("02","lisi02");
		map.put("03","lisi03");
		map.put("04","lisi04");
		//将map集合中的映射关系取出，存入到Set集合中。
		Set<Map.Entry<String, String>>entrySet=map.entrySet();
		Iterator<Map.Entry<String, String>> it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String>entry=it.next();
			sop("Key:"+entry.getKey()+",value:"+entry.getValue());
		}
		//先获取map集合的所有键的Set集合，keySet();
		//Set<String> ks=map.keySet();
		
		//有了Set集合，就可以获取迭代器。
//		Iterator it=ks.iterator();
//		while(it.hasNext())
//		{
//			String key=(String)it.next();
//			//有了键就可以通过map集合的get方法获取其对应的值。
//			String value=map.get(key);
//			sop("key="+key+",value="+value);
//		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
