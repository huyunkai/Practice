/*
 * ���ͣ�JDK1.5�汾�Ժ���������ԡ����ڽ����ȫ���⣬��һ�����Ͱ�ȫ���ơ�
 * �ô���
 * 1.������ʱ�ڳ�������ClassCastException��ת�Ƶ��˱���ʱ�ڡ�
 * �����ڳ���Ա������⣬����������������٣������ȫ���⡣
 * 2.������ǿ��ת���鷳��
 * ���͸�ʽ��ͨ��<>������Ҫ�����������������͡�
 * ��ʹ��java�ṩ�Ķ���ʱ��ʲôʱ��д�����أ�
 * ͨ���ڼ��Ͽ���кܳ�����
 * ֻҪ����<>��Ҫ���巺�͡�
 * ��ʵ<>���������������͵ġ�
 * ��ʹ�ü���ʱ����������Ҫ�洢������������Ϊ�������ݵ�<>�м��ɡ�
 * 
 * */
package Single;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String []args)
	{
		
		ArrayList<String> a1=new ArrayList<String>();//����һ��ArrayList������������ŵ�Ԫ����String���͡�
		a1.add("abc01");
		a1.add("abc022");
		a1.add("abc0112");
		a1.add(new Integer(4).toString());
		Iterator<String> it=a1.iterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			sop(s+":"+s.length());
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
