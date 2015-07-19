/*
 * //读取一个.java文件，并打印到控制台上。
 */
package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String []args)
	{
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\sony\\workspace\\Prictice\\src\\IO\\IODemo.java");
			char []buf=new char[1024];
			int num=0;
			try {
				while((num=fr.read(buf))!=-1)
				{
					System.out.print(new String(buf,0,num));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
