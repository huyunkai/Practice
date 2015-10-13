package JQ01;

import java.util.Arrays;
import java.util.List;

public class Demo4 
{
	/*
	 * 可变参数
	 * @param args
	 * */
	public static void main(String []args)
	{
		//用asList将数组变为list容器
		List list=Arrays.asList("aa","bb","cc");
		//System.out.println(list);
		String []str={"xx","yy","zz"};
		List list1=Arrays.asList(str);
		System.out.println(list1);
		
		//以下int数组和Integer数组的不同.
		//原始的方式
		int nums[]={1,2,3};
		List list2=Arrays.asList(nums);
		//System.out.println(list2);
		Integer num2[]={1,2,3};
		List list3=Arrays.asList(num2);
		//System.out.println(list3);
		sum(1,nums);
	}
	public static void sum(int kk,int ...nums)
	{
		//可变参数在用时,当成数组使用即可.
		for(int num:nums)
		{
			kk+=num;
		}
		System.out.println(kk);
	}
}
