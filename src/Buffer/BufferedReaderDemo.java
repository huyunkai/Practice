/*
 * �ַ���ȡ����������
 * �û������ṩ��һ��һ�ζ�һ�еķ��� readLine����������ı����ݵĻ�ȡ��
 * ������nullʱ����ʾ�����ļ�ĩβ��
 * */
package Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String []args)throws IOException
	{
		//����һ����ȡ��������ļ������.
		FileReader fr=new FileReader("C:\\Users\\sony\\workspace\\Prictice\\buf.txt");
		//Ϊ�����Ч�ʣ����뻺�弼�������ַ�����ȡ��������Ϊ�������ݸ��������Ĺ��캯����
		BufferedReader bufr=new BufferedReader(fr);
		String s=null;
		int x=0;
		while((s=bufr.readLine())!=null)
		{
		System.out.println("s"+x+"="+s);
		x++;
		}
		bufr.close();
	}
}
