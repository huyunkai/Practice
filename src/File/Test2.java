/*
 * 打印流:
 * 该流提供了打印方法,可以将各种数据类型的数据原样打印.
 * PrintStream
 * 构造函数可以接受的参数类型:
 * 1file对象 File
 * 2 字符串路径  String 
 * 3，字节输出流 OutputStream
 * 字节打印流
 * 
 * 字符打印流
 * PrintWriter
 * 构造函数可以接受的参数类型:
 * 1 file对象 File
 * 2 字符串路径  String 
 * 3，字节输出流 OutputStream
 * 4,字符输出流 Writer.
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
