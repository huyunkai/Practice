/*
 * TreeSet:���Զ�Set���Ͻ�������
 *         �ײ����ݽṹʽ��������
 *         ��֤Ԫ��Ψһ�Ե����ݡ�
 *         compareTo���� return 0.
 *         TreeSet����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԡ�Ԫ����Ҫʵ��
 *         Comparable�ӿڣ�����compareTo������
 *         ���ַ�ʽҲ��ΪԪ�ص���Ȼ˳�򣬻�����Ĭ��˳��
 *         TreeSet�ĵڶ�������ʽ��
 *         ��Ԫ�������߱��Ƚ���ʱ�����߾߱��ıȽ��Բ�������Ҫ�ġ�
 *         ��ʱ����Ҫ�ü�������߱��Ƚ��ԡ�
 *         �ڼ��ϳ�ʼ��ʱ�����пαȽϷ�ʽ��
 *         
 *         
 *         
 *         
 * ������TreeSet�����д洢�Զ������ѧ����
 * �밴��ѧ���������������
 *  ��ס������ʱ������Ҫ������ͬʱ��һ��Ҫ�жϴ�Ҫ������
 * */
package Single;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String  []args)
  {
	  TreeSet<Student> ts=new TreeSet<Student>();
	  ts.add(new Student("lisi01",22));
	  ts.add(new Student("lisi02",21));
	  ts.add(new Student("lisi05",21));
	  ts.add(new Student("lisi03",26));
	  ts.add(new Student("lisi04",27));
	 Iterator it=ts.iterator();
	  while(it.hasNext())
	  {
		  Student stu=(Student)it.next();
		  sop(stu.getName()+"..."+stu.getAge());
	  }
	  
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
}
