/*
 * ���룺�ַ�������ֽ�����.
 * 
 * ����:�ֽ��������ַ���.
 * String  -->byte[]; str.getBytes(charsetName);
 * 
 * byte[] -->String :new String(byte[],charsetName);
 * */
package File;

import java.util.Arrays;

public class BM {
	public static void main(String []args)throws Exception
	{
		String s="���������";
		
		byte [] b1=s.getBytes("GBK");
		System.out.println(Arrays.toString(b1));
		String s1=new String(b1,"iso8859-1");
		//����s1����iso8859-1����.
		System.out.println(s1);
		byte[] b2=s1.getBytes("iso8859-1");
		System.out.println(Arrays.toString(b2));
		String s2=new String(b2,"GBK");
		System.out.println(s2);		
	}
}
