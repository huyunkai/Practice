/*
 * 
 * */
package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EncodingStream {	
	public static void main(String []args)throws IOException
	{
		//WirteText();
		readText();
	}
	public static void WirteText()throws IOException
	{
		//创建一个输入流 
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("utf.txt"),"UTF-8");
		osw.write("你好");
		osw.close();
	}
	public static void readText()throws IOException
	{
		InputStreamReader isr=new InputStreamReader(new FileInputStream("gbk1.txt"),"GBK");
		char []buf=new char[10];
//		int len=isr.read(buf);
//		String str=new String(buf,0,len);
		int len=0;
		while((len=isr.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}
//		System.out.println(str);
		isr.close();
	}
}
