/*
 * ÿ��ѧ�����ж�Ӧ�Ĺ�����.
 * ѧ��Student,��ַString.
 * ѧ������:���������䡣
 * ע�⣺������������ͬ����Ϊͬһ��ѧ����
 * ��֤ѧ����Ψһ�ԡ�
 * 1������ѧ����
 * 2 ����������
 * 3 ��ȡmap�����е�Ԫ�ء�
 * */
package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String []args)
	{
		Map<Student,String>hm=new HashMap<Student, String>();
		hm.put(new Student("lisi01", 11),"heibei");
		hm.put(new Student("lisi02", 22),"liuyang");
		hm.put(new Student("lisi03", 17),"beijing");
		hm.put(new Student("lisi04", 13),"nanjing");
		//��һ��ȡ����ʽ keySet
		Set<Student> keySet1=hm.keySet();
		Iterator<Student>it=keySet1.iterator();
		while(it.hasNext())
		{
			Student stu=(Student)it.next();
			
			String value=hm.get(stu);
			sop("student:"+stu+",address:"+value);
			
		}	
		//�ڶ���ȡ����ʽentrySet
		Set<Map.Entry<Student,String>>entrySet1=hm.entrySet();
		Iterator<Map.Entry<Student, String>>it2=entrySet1.iterator();
		while(it2.hasNext())
		{
			Map.Entry<Student, String>map=it2.next();
			Student stu=map.getKey();
			String addr=map.getValue();
			sop("student:"+stu+",addr:"+addr);
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
