/*
 * ���Զ��������ΪԪ�ش洢��ArrayList�����У���ȥ���ظ�Ԫ�ء�
 * �磺��
 * ͬ����ͬ������Ϊ�ظ�Ԫ�ء�
 * ˼·��
 * 1,���������������ݷ�װ�����
 * 2���������������˴��롣
 * 3��ȡ����
 * List�����ж�Ԫ���Ƿ���ͬ�����ݵ���Ԫ�ص�Equals�����Ƿ���ͬ��
 * 
 * */
package Single;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		 ArrayList a1=new ArrayList();
		 a1.add(new Person("����",20));//a1.add(Object obj);
		 a1.add(new Person("lisi01",20));
		 a1.add(new Person("lisi02",20));
		 a1.add(new Person("lisi03",20));
		 a1.add(new Person("lisi04",20));
//		 a1.add(new Person("lisi01",20));
//		 a1.add(new Person("lisi02",20));
//		 a1.add(new Person("lisi03",20));
//		 a1.add(new Person("lisi04",20));
		//a1=singleElemets(a1);
		 sop("remove 04:"+ a1.remove(new Person("lisi04",20)));
		 Iterator it=a1.iterator();
		 while(it.hasNext())
		 {
			 Person p=(Person)it.next();
			 sop(p.getName()+"..."+p.getAge());
//			 singleElemets(a1);
//			 sop(p.getName()+"..."+p.getAge());
		 }

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	//ȡ���ظ�Ԫ��
	public static ArrayList singleElemets(ArrayList a1)
	{
		ArrayList new1=new ArrayList();
		Iterator it=a1.iterator();
		while(it.hasNext())
		{
			Object obj=it.next();
			if(!new1.contains(obj))//����contains�������Զ����õײ��equals������
			{
				new1.add(obj);
			}
		}
		return new1;
	}

}
