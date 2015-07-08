/*
 * Map����:�ü��ϴ洢��ֵ�ԡ�һ��һ������档����Ҫ��֤����Ψһ�ԡ�
 * 1����ӡ�
 * 	put(K key,V value);
 *  putAll(Map<? extends K,? extends V>n);
 * 2��ɾ����
 * 	clear();
 * 	remove(Object key);
 * 3���жϡ�
 * 	containsValue(Object value);
 * 	containsKey(Object key);
 *  isEmpty();
 * 4����ȡ��
 * 	get(Object key);
 * 	size();
 * 	values();
 * Map
 * 	��--Hashtable:�ײ��ǹ�ϣ�����ݽṹ�������Դ���null��nullֵ���ü������߳�ͬ���ġ�jdk1.0Ч�ʵ�
 * 	��--HashMap:�ײ��ǹ�ϣ�����ݽṹ������ʹ��nullֵ��null�����ü���ʱ��ͬ���ġ�jdk1.2Ч�ʸ�
 * 	��--TreeMap:�ײ��Ƕ��������ݽṹ���̲߳�ͬ�����������ڸ�map�����еļ���������
 * ��Set����
 * ��ʵSet�ײ����ʹ����Map���ϡ�
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
//		Iterator it=hashMap1.entrySet().iterator();//entrySet��mapת��Ϊset���͡�
//		while(it.hasNext())
//		{
//		sop(it.next());
//		}
		Map<String, String>map=new HashMap<String, String>();
		//���Ԫ��,���Ԫ�أ�����������ʱ����ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ�м���Ӧֵ����put�����᷵�ر�����ԭ�м���Ӧֵ��
		sop("put:"+map.put("01","����1"));
		sop("put:"+map.put("01","wanglu"));
		map.put("02","����2");
		map.put("03","����3");
		map.put("04","����4");
//		sop("containsKey:"+map.containsKey("01"));
//		sop("containsKey:"+map.containsKey("011"));
//		sop("remove:"+map.remove("02"));
//		sop(map);
		sop("get:"+map.get("02"));
		map.put("05", null);
		sop("get:"+map.get("05"));
		//����ͨ��get�����ķ���ֵ���ж�һ�����Ƿ���ڡ�ͨ������null���ж�
		
		//��ȡmap���������е�ֵ��
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
