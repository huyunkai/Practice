package JQ01;

import java.util.ArrayList;
import java.util.List;

public class Demo3 
{
	/*
	 * ��ǿforѭ��ֻ�ʺ�ȡ���ݣ������ʺ��޸����ݣ������Ҫ�޸����ݣ����黹��ʹ�ô�ͳ��forѭ��.
	 * */
	public static void main(String []args)
	{
		int nums[]={1,2,3};
		for(int num:nums)
		{
			num=10;
		}
		System.out.println(nums[0]);//������ʹ����ǿ��forѭ���ǲ��Ǹı�����ԭ���Ĵ�С��.
		//����ʹ��ԭʼ��forѭ��
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=10;
		}
		System.out.println(nums[0]);//������ʹ��ԭʼ��forѭ���ı���ԭʼ���ݵĴ�С.
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Object obj:list)
		{
			System.out.println("�޸�ǰ������");
			System.out.println(obj);
		}
		System.out.println(list.size());
		//�޸�list�����ֵķ�ʽ
		list.set(1, 10);//�޸�list�еڶ������ݵĴ�С.
		for(Object obj1:list)
		{
			System.out.println("�޸ĺ������");
			System.out.println(obj1);
		}
		
	}
	
	
}
