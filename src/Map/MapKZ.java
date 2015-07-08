/*
 * map扩展知识。
 * map集合被使用是因为具备映射关系。
 * 
 * "yureban" "01" "zhangsan";
 * "yureban" "02" "lisi";
 * 
 * "jiuyeban" "01" "wangwu"
 * "jiuyeban" "02" "zhouliu"
 * */
package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MapKZ {
	public static void Demo()
	{
		HashMap<String,List<Student2>>czbk=new HashMap<String, List<Student2>>();
		List<Student2> yure=new ArrayList<Student2>();
		List<Student2> jiuye=new ArrayList<Student2>();
		yure.add(new Student2("01","zahngsan"));
		yure.add(new Student2("02","lisi"));
		
		jiuye.add(new Student2("01","wangwu"));
		jiuye.add(new Student2("02","zhouliu"));
		czbk.put("yureban", yure);
		czbk.put("jiuyeban", jiuye);
		Iterator<String> it=czbk.keySet().iterator();
		while(it.hasNext())	
		{
			String roomname=it.next();
			List<Student2> room=czbk.get(roomname);
			sop(roomname);
			getInfos(room);
		}
		
	}
	public static void getInfos(List<Student2>list)
	{
		Iterator<Student2> it=list.iterator();
		while(it.hasNext())
		{
			Student2 stu=it.next();
			sop(stu);
		}
	}
	public static void main(String []args)
	{
	    Demo();
//		HashMap<String,String> yure=new HashMap<String, String>();
//		HashMap<String, String>jiuye=new HashMap<String, String>();
//		HashMap<String,HashMap<String, String>>czbk=new HashMap<String, HashMap<String,String>>();
//		yure.put("01", "zhangsan");
//		yure.put("02", "lisi");
//		jiuye.put("01", "zhaoliu");
//		jiuye.put("02", "wangwu");
//		czbk.put("yureban", yure);
//		czbk.put("jiuyeban", jiuye);
//		
//		//getStudentInfo(yure);
//		//遍历czbk集合，获取所有的教师。
//		Iterator<String> it=czbk.keySet().iterator();
//		while(it.hasNext())
//		{
//			String roomname=it.next();
//			HashMap<String,String> room=czbk.get(roomname);
//			sop(roomname);
//			getStudentInfo(room);
//		}
	}
	public static void getStudentInfo(HashMap<String,String>roomMap)
	{
		Iterator<String>it=roomMap.keySet().iterator();
		while(it.hasNext())
		{
			String id=it.next();
			String name=roomMap.get(id);
			sop(id+"::"+name);
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
		
	}
}
