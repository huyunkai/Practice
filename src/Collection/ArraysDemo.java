/*
 * Arrays:���ڲ�������Ĺ�����
 * ���涼�Ǿ�̬������
 * addList:��������list���ϡ�
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
		//��������list������ʲô�ô���
		/*
		 * ����ʹ�ü��ϵ�˼��ͷ��������������е�Ԫ�ء�
		 * ע�⣺�������ɼ��ϣ�������ʹ�ü��ϵ���ɾ������
		 * ��Ϊ����ĳ����ǹ̶��ġ�
		 * contains,
		 * get,
		 * indexOf,
		 * subList();
		 * �������ɾ�ˣ���ô�ᷢ����֧�ֲ����쳣��
		 * */
		sop(list);
		Integer []nums={2,4,5};
		List<Integer> list1=Arrays.asList(nums);
		sop(list1);
		/*
		 * ��������е�Ԫ�ض��Ƕ�����ô��ɼ���ʱ�������е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ�ء�
		 * ��������е�Ԫ�ض��ǻ����������ͣ���ô�Ὣ��������Ϊ�����е�Ԫ�ش��ڡ�
		 * */
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
