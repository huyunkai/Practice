/*
 * 缓冲区的出现是为了提高流的操作效率而出现的。
 * 所以创建缓冲区之前
 * ，必须先有流对象。
 * 该缓冲区中提供了一个跨平台的换行符。
 * newline();
 * */
package Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String []args)throws IOException
	{
		//创建一个字符写入流对象。
		FileWriter fw=new FileWriter("buf.txt");
		//为了提高字符写入流效率。加入了缓冲技术。
		//只需要将提高效率的流对象作为参数传递给缓冲区的构造函数即可。
		BufferedWriter bw=new BufferedWriter(fw);
		for(int x=1;x<5;x++)
		{
		
			bw.write("abcde"+x);//只要用到缓冲区，就要记得刷新.
			bw.newLine();//跨平台系统，任何系统都可以使用。
			bw.flush();
		}
		
		bw.close();//其实关闭缓冲区就是在关闭缓冲区中的流对象.
		
	}
}
