package JQ01;

import java.util.ArrayList;
import java.util.List;

public class Demo3 
{
	/*
	 * 增强for循环只适合取数据，而不适合修改数据，如果想要修改数据，建议还是使用传统的for循环.
	 * */
	public static void main(String []args)
	{
		int nums[]={1,2,3};
		for(int num:nums)
		{
			num=10;
		}
		System.out.println(nums[0]);//在这里使用增强的for循环是不是改变数组原来的大小的.
		//建议使用原始的for循环
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=10;
		}
		System.out.println(nums[0]);//在这里使用原始的for循环改变了原始数据的大小.
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Object obj:list)
		{
			System.out.println("修改前的数据");
			System.out.println(obj);
		}
		System.out.println(list.size());
		//修改list中数字的方式
		list.set(1, 10);//修改list中第二个数据的大小.
		for(Object obj1:list)
		{
			System.out.println("修改后的数据");
			System.out.println(obj1);
		}
		
	}
	
	
}
