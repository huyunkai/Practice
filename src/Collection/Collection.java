/**
 * ���Ͽ�ܵĹ����ࣺ
 * Collection:
 * �̲߳���ȫ�Ľ����ʽ��
 * 
 */
package Collection;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.imageio.ImageIO;

public class Collection {
	public static void main(String []args)
	{
		shuffleDemo();
	}
	public static void shuffleDemo() 
	{
		
		String []str={"����","����","����","÷��"};
		List<String> list=new ArrayList<String>();
		for(int i=2;i<11;i++)
		{
			for(int j=0;j<str.length;j++)
		list.add(""+str[j]+""+i+"");	
		}
		list.add("A");
		list.add("J");
		list.add("Q");
		list.add("K");
	
		for(int k=0;k<4;k++)
		{
			Collections.shuffle(list);//�������м���
			sop(list);	
		}
		
	}
	public static void OrderDemo()
	{
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder(new StrLenComparator2()));
		ts.add("asdvd");
		ts.add("safa");
		ts.add("casas");
		ts.add("safdsa");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
	}
	public static void orderDemo()
	{
		TreeSet<String>ts=new TreeSet<String>(Collections.reverseOrder());//����һ����ת��
		ts.add("abcde");
		ts.add("aaa");
		ts.add("kkk");
		ts.add("ccc");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
	}
	public static void replaceAllDemo()
	{

		List<String>list=new ArrayList<String>();
		list.add("sdad");
		list.add("sdvda");
		list.add("sadas");
		list.add("sdasfe");
		list.add("sdgeersaf");
		sop(list);
		Collections.replaceAll(list, "sadas", "qq");
		sop(list);
		Collections.reverse(list);
		sop(list);
	}
	public static void maxDemo()
	{
		List<String>list2=new ArrayList<String>();
		list2.add("sdad");
		list2.add("sdvda");
		list2.add("sadas");
		list2.add("sdasfe");
		list2.add("sdgeersaf");
		Collections.sort(list2);
		sop(list2);
		String max=Collections.max(list2);
		System.out.println("max="+max);
		
	}
	/*
	 * ��ϰ��fill�������Խ�List����������Ԫ���滻��ָ��Ԫ�أ�
	 * ��list�����в���Ԫ���滻��ָ��Ԫ�ء�
	 * 
	 * */
	public static void fillDemo()
	{
		List<String>list =new ArrayList<String>();
		list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");
		sop(list);
		Collections.fill(list, "pp");
		sop(list);
	}
	public static void sort()
	{
		List<String> list=new ArrayList<String>();
		list.add("abcd");
		list.add("sada");
		list.add("s");
		list.add("sa");
		list.add("scdwdadasfa");
		list.add("nsiafhg");
		sop(list);
	    //Collections.sort(list);
		Collections.swap(list, 2, 3);
	    sop(list);
		
//		Collections.sort(list,new StrLenComparator());
//        Iterator<String> it=list.iterator();
//        while(it.hasNext())
//        {
//		sop(it.next());
//        }
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
