/*
 * 第二种方式：通过字符数组进行读取。
 * */
package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String []args) throws IOException
	{
		try {
			FileReader fr=new FileReader("demo.txt");
			int num=0;
			char []buff=new char[1024];//2K的空间数据。
			while((num=fr.read(buff))!=-1)
			{
				System.out.println(new String(buff,0,num));
			}
			//定义一个字符数组。用于存储读到字符。
			//该read(char [])返回的是读到字符个数。
//			char [] buf=new char[50];
//			int num;
//			try {
//				num = fr.read(buf);
//				 System.out.println("num="+num+"..."+new String(buf,0,num));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	       
//	        try {
//				fr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}
