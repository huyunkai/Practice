/*
 * 每个学生都有对应的归属地.
 * 学生Student,地址String.
 * 学生属性:姓名，年龄。
 * 注意：姓名和年龄相同的视为同一个学生。
 * 保证学生的唯一性。
 * 1，描述学生。
 * 2 定义容器。
 * 3 获取map集合中的元素。
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
		//第一种取出方式 keySet
		Set<Student> keySet1=hm.keySet();
		Iterator<Student>it=keySet1.iterator();
		while(it.hasNext())
		{
			Student stu=(Student)it.next();
			
			String value=hm.get(stu);
			sop("student:"+stu+",address:"+value);
			
		}	
		//第二种取出方式entrySet
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
