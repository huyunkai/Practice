/*쳲��������еĵݹ�ʹ��1,1,2,3,5,8,13,21,34.....
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
		String inputStr="";	//�������������תΪ�ַ���
		String result="";	//��ǰ���巴ת����ַ���
		//ѭ��
		for(int i=inputStr.length()-1;i>=0;i--){	
		//һ��һ���ַ����ӹ������ַ���
		result=result+inputStr.charAt(i);
		}
		//��ת����ַ���ת��Ϊint�󷵻�
		return Integer.parseInt(result);
		}
}
