/*
 * Arrays:用于操作数组的工具类
 * 里面都是静态方法。
 * addList:讲数组变成list集合。
 * */
package Collection;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static boolean MyContains(String arr[],String key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(key))
				return true;
			
		}
		return false;
	}
	public static void main(String []args)
	{
		int arr[]={2,4,5};
		System.out.println(Arrays.toString(arr));
		String []arr1={"abc","cc","kkkk"}; 
		List<String> list=Arrays.asList(arr1);
		sop("contains:"+MyContains(arr1, "cc"));
		//把数组变成list集合有什么好处？
		/*
		 * 可以使用集合的思想和方法来操作数组中的元素。
		 * 注意：讲数组变成集合，不可以使用集合的增删方法。
		 * 因为数组的长度是固定的。
		 * contains,
		 * get,
		 * indexOf,
		 * subList();
		 * 如果你增删了，那么会发生不支持操作异常。
		 * */
		sop(list);
		Integer []nums={2,4,5};
		List<Integer> list1=Arrays.asList(nums);
		sop(list1);
		/*
		 * 如果数组中的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素。
		 * 如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在。
		 * */
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
