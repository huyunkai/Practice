/*
 * ��дһ�����ͺ�����ʵ�ֵ�������Ԫ��֮��Ľ���
 * */
package JQ01;

public class Demo8 {
	public static void main(String[]args)
	{
		Integer arrs[]={1,2,3,4};
		swap(arrs,1,2);
		for(int arr:arrs)
		{
			System.out.print(arr);
		}
	}
	public static <T> void swap(T arr[],int i,int j)
	{
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
