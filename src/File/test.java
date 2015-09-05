/*斐波那契数列的递归使用1,1,2,3,5,8,13,21,34.....
 * */
package File;

import java.util.Scanner;

public class test {
	public static void main(String []args)
	{
//		int a=1,b=1;
//		int sum=0;
//		for(int i=0;i<10;i++)
//		{
//		sum+=DG(i);
//		}
//		System.out.println(sum);
		System.out.println(reverse(10));
	}
	public static int DG(int n)
	{
		if(n<=2)
			return 1;
		else{
			return DG(n-1)+DG(n-2);
			}
	}
	public static int toBin(int num)
	{
		while(num>0)
		{
			System.out.print(num%2);
			num/=2;
		}
		return num;
	}
	public static int reverse(int inputNum){
		String inputStr="";	//将输入的整数先转为字符串
		String result="";	//提前定义反转后的字符串
		//循环
		for(int i=inputStr.length()-1;i>=0;i--){	
		//一个一个字符连接构造新字符串
		result=result+inputStr.charAt(i);
		}
		//反转后的字符串转换为int后返回
		return Integer.parseInt(result);
		}
}
