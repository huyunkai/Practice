package Single;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
   public static void main(String []args)
   {
	   ArrayList a1=new ArrayList();
	   a1.add("java01");
	   a1.add("java02");
	   a1.add("java03");
	   a1.add("java04");
	   a1.add("java05");
	   a1.add("java06"); 
	   a1.add("java04");
	   a1.add("java05");
	   //a1.add("java06");
	   /*sop(a1);
	   a1=singleElement(a1);
	   sop(a1);
	   */
	   /*
	    * �ڵ���ʱѭ����next����һ�Σ���ҪHasNext�ж�һ�Ρ�
	    * */
//	   Iterator it=a1.iterator();
//	   while(it.hasNext())
//	   {
//		   sop(it.next()+"..."+it.next());
//	   }
   }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
  public static ArrayList singleElement(ArrayList a1)
  {
	  //����һ����ʱ����.
	  ArrayList newa1=new ArrayList();
	 Iterator it=a1.iterator();
	 while(it.hasNext())
	 {
		 Object obj=it.next();
		 if(!newa1.contains(obj))
		 {
			 newa1.add(obj);
		 }
	 }
	return newa1;
  }
}
