/*
 * ��Ԫ�������߱��Ƚ��ԣ����߾߱��ıȽ��Բ�������Ҫ�ġ�
 * ��ʱ��Ҫ����������߱��Ƚ��ԡ�
 * �����˱Ƚ��������Ƚ���������Ϊ�������ݸ�TreeSet���ϵĹ��캯����
 * ���������򶼴���ʱ���ԱȽ���Ϊ����
 * 
 * ����һ���࣬ʵ��comparator�ӿڣ�����compare������
 * **/

package Single;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String []args)
	{
		@SuppressWarnings("unchecked")
		TreeSet<Student> ts=new TreeSet<Student>(new MyCompare());
		ts.add(new Student("lisi01",20));
		ts.add(new Student("lisi02",21));
		ts.add(new Student("lisi03",22));
		ts.add(new Student("lisi04",23));
		ts.add(new Student("lisi05",16));
		ts.add(new Student("lisi06",15));
		ts.add(new Student("lisi06",15));
		ts.add(new Student("lisi06",16));
		ts.add(new Student("lisi06",17));
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			Student st=(Student)it.next();
			sop(st.getName()+"...."+st.getAge());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
