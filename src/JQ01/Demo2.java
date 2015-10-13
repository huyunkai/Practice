package JQ01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {
	/*
	 * 增强for
	 * @param args
	 * */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Object obj:list)
		{
			int num=(Integer)obj;
			//System.out.println(num);
		}
		//System.out.println("---------------------");
		Map map=new LinkedHashMap();
		//map.entry
		map.put("1", "aa");
		map.put("2", "bb");
		map.put("3", "cc");
		//取数据的方式1
		Set set=map.keySet();
		Iterator it =set.iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			String value=(String)map.get(key);
			//System.out.println(key+"..."+value);
		}
		//才数据方式2
		Set set1=map.entrySet();
		Iterator it1=set1.iterator();
		while(it1.hasNext())
		{
			Map.Entry entry=(Entry)it1.next();
			String key1=(String)entry.getKey();
			String value1=(String)entry.getValue();
			//System.out.println(key1+"...."+value1);
		}
		//采数据方式3
		for(Object obj:map.entrySet())
		{
			Map.Entry entry1=(Entry)obj;
			String key2=(String)entry1.getKey();
			String value2=(String)entry1.getValue();
			System.out.println(key2+"..."+value2);
		}
	}

}
