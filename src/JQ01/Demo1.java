package JQ01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 
{
	/*װ�����
	 * @param args
	 * */
	public static void main(String []args)
	{
		int i=3;
		//jdkװ��
		Integer num=i;
		//����
		int j=num;
		//Ӧ�ó���
		List list =new ArrayList();
		//װ��
		list.add(1);
		list.add(2);
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			int j1=(Integer)it.next();
			System.out.println(j1);
		}
	}
}
