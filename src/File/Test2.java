/*
 * ��ӡ��:
 * �����ṩ�˴�ӡ����,���Խ������������͵�����ԭ����ӡ.
 * PrintStream
 * ���캯�����Խ��ܵĲ�������:
 * 1file���� File
 * 2 �ַ���·��  String 
 * 3���ֽ������ OutputStream
 * �ֽڴ�ӡ��
 * 
 * �ַ���ӡ��
 * PrintWriter
 * ���캯�����Խ��ܵĲ�������:
 * 1 file���� File
 * 2 �ַ���·��  String 
 * 3���ֽ������ OutputStream
 * 4,�ַ������ Writer.
 * */
package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test2 {
	public static void main(String []args)throws IOException
	{
		BufferedReader bufr=
				new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("a.txt")),true);
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
			//out.flush();
		}
		out.close();
		bufr.close();
	}
}
