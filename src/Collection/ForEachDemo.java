/*
 * �߼�forѭ��
 * 
 * ��ʽ��
 * for(��������  ���������������ļ���(Collection)��������)
 * {
 * 
 * }
 * �Լ��Ͻ��б�����
 * ֻ�ܻ�ȡԪ�أ����ǲ��ܶԼ��Ͻ��в�����
 * ���������˱����������Խ���remove������Ԫ�صĶ�����
 * ���ʹ��ListIterator,�������ڱ��������жԼ��Ͻ�����ɾ�Ĳ�Ķ�����
 * ��ͳfor�͸߼�for��ʲô�����أ�
 * �߼�for��һ�������ԡ������б�������Ŀ�ꡣ
 * �����ڱ��������ʱ�򣬻��ǽ���ʹ�ô�ͳfor,��Ϊ��ͳfor���Զ���Ǳꡣ
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
