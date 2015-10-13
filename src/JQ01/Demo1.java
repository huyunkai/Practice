package JQ01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 
{
	/*装箱拆箱
	 * @param args
	 * */
	public static void main(String []args)
	{
		int i=3;
		//jdk装箱
		Integer num=i;
		//拆箱
		int j=num;
		//应用场景
		List list =new ArrayList();
		//装箱
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
