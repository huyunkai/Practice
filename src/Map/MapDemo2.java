/*
 * map���ϵ�����ȡ����ʽ��
 * 1��Set<K> KeySet:��map�����еļ����뵽Set���ϣ���ΪSet�߱������������п��Ե�����ʽȡ��
 *   ���еļ����ٸ���get��������ȡÿһ������Ӧ��ֵ��
 *   
 *   map���ϵ�ȡ��ԭ��:��map����ת��set���ϣ���ͨ��������ȡ����
 * 2,Set<Map.Entry<k,v>> entrySet: ��map�����е�ӳ����Ĵ��뵽��set�����У��������ϵ���������;���Map.Entry.
 * Map.Entry ��ʵEntryҲ��һ���ӿڣ�����map�ӿ��е�һ���ڲ��ӿڡ�
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
		//��map�����е�ӳ���ϵȡ�������뵽Set�����С�
		Set<Map.Entry<String, String>>entrySet=map.entrySet();
		Iterator<Map.Entry<String, String>> it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String>entry=it.next();
			sop("Key:"+entry.getKey()+",value:"+entry.getValue());
		}
		//�Ȼ�ȡmap���ϵ����м���Set���ϣ�keySet();
		//Set<String> ks=map.keySet();
		
		//����Set���ϣ��Ϳ��Ի�ȡ��������
//		Iterator it=ks.iterator();
//		while(it.hasNext())
//		{
//			String key=(String)it.next();
//			//���˼��Ϳ���ͨ��map���ϵ�get������ȡ���Ӧ��ֵ��
//			String value=map.get(key);
//			sop("key="+key+",value="+value);
//		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
