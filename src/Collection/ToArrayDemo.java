/*
 *Collection�ӿ��е�ToArray������
 * */
package Collection;

import java.util.ArrayList;

public class ToArrayDemo {
	public static void main(String []args)
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("abc");
		a1.add("efg");
		a1.add("hij");
		/*
		 * 1,ָ�����͵����鵽��Ҫ����೤�أ�
		 * ��ָ�����͵����鳤��С���˼��ϵ�size,��ô�÷����ڲ��ᴴ��һ���µ����鳤��Ϊ���ϵ�size.
		 * ��ָ�����͵ĳ��ȴ����˼��ϵ�size,�Ͳ����´������飬����ʹ�ô��ݽ��������顣
		 * ���Դ���һ���ոպõ��������š�
		 * 2��ΪʲôҪ�����ϱ����飿
		 * Ϊ�����ƶ�Ԫ�صĲ���������Ҫ������ɾ�ˡ�
		 * 
		 * 
		 * 
		 * */
		String []arr=a1.toArray(new String[a1.size()]);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
