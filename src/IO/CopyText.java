/*
 * 将C盘一个文本文件复制到D盘。
 * 
 * 复制原理：其实就是将c盘下的文件数据存储到D盘的一个文件中。
 * 步骤：
 * 1,在D盘创建一个文件,用于存储c盘文件中的数据。
 * 2，定义读取流和c盘文件关联。
 * 3，通过不断的读写完成数据存储。
 * 4，关闭资源。
 * 
 * */
package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyText {
	public static void main(String []args)
	{
		copy_two();
	}
	public static  void copy_one()throws IOException
	{
		//创建目的地。
		FileWriter fw=new FileWriter("D:\\fileone.java");
		//与已有文件关联。
		FileReader fr=new FileReader("C:\\Users\\sony\\workspace\\Prictice\\Demo2.txt");
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}
	public static void copy_two()
	{
		FileWriter fw=null;
		FileReader fr=null;
		try
		{
			fw=new FileWriter("D:\\filetwo.java");
			fr=new FileReader("C:\\Users\\sony\\workspace\\Prictice\\Demo.txt");
			char []buff=new char[1024];
			int len=0;
			while((len=fr.read(buff))!=-1)
			{
				fw.write(buff,0,len);
			}
		}
		catch(IOException e)
		{
           throw new RuntimeException("读写失败！");			
		}
		finally
		{
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
