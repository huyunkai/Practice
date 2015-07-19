/*
 * 字符读取流缓冲区：
 * 该缓冲区提供了一个一次读一行的方法 readLine，方便与对文本数据的获取。
 * 当返回null时，表示读到文件末尾。
 * */
package Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String []args)throws IOException
	{
		//创建一个读取流对象和文件相关联.
		FileReader fr=new FileReader("C:\\Users\\sony\\workspace\\Prictice\\buf.txt");
		//为了提高效率，加入缓冲技术，将字符流读取流对象作为参数传递给缓冲对象的构造函数。
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
