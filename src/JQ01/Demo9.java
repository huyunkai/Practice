package JQ01;

public class Demo9 
{
	public static void main(String []args)
	{
		Integer nums[]={1,2,3,4,5,6};
		reverse2(nums);
		for(int na:nums)
		{ 
			System.out.print(na);
		}
	}
	public static <T> void reverse(T arr[])
	{
		int  startindex=0;
		int  endindex=arr.length-1;
		for(;;)
		{
			if(startindex>=endindex)
				break;
			T temp=arr[startindex];
			arr[startindex]=arr[endindex];
			arr[endindex]=temp;
			startindex++;
			endindex--;
		}
		
	}
	public static <T> void reverse2(T arr[])
	{
		for(int startindex=0,endindex=arr.length-1;startindex<endindex;startindex++,endindex--)
		{
			T temp=arr[startindex];
			arr[startindex]=arr[endindex];
			arr[endindex]=temp;
			
		}
		
	}
}
