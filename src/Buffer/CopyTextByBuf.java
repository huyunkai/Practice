/*
 * 通过缓冲区复制一个.java文件.
 * readline方法返回的时候只返回回车符之前的数据内容，并不返回回车符.
 * */
package Buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBuf {
	public static void main(String []args)
	{
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		try
		{
			bufr=new BufferedReader(new FileReader("C:\\Users\\sony\\workspace\\Prictice\\buf.txt"));
			bufw=new BufferedWriter(new FileWriter("D:\\buff.txt"));
			String line=null;
			while((line=bufr.readLine())!=null)
			{
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}

		}
		catch(IOException e)
		{
			throw new RuntimeException("读写失败！");
		}
		finally
		{
			try {
				if(bufr!=null)
				bufr.close();
			} catch (IOException e) {
				throw new RuntimeException("读取关闭失败！");
			}
			try {
				bufw.close();
			} catch (IOException e) {
				throw new RuntimeException("写入关闭失败！");
			}
		}
		}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}