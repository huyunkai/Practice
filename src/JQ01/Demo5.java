package JQ01;

import java.util.Arrays;

public class Demo5 
{
	/*
	 * @param args
	 * */
	public static void main(String []args)
	{
		//alt+/
		//根据数组的具体数字搜寻当前的位置.
		int arr[]={1,2,3,4,5};
		int pos=Arrays.binarySearch(arr, 2);
		System.out.println(pos);
	}
}
