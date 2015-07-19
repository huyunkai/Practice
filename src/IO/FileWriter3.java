/*
 * 演示对已有文件的数据续写。
 * */
package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter3 {
	public static void main(String []args)
	{
		//传递一个true参数，代表不覆盖已有的文件，并在已有文件的末尾处进行续写。
		FileWriter fw=null;
		try {
			fw = new FileWriter("demo.txt",true);
			fw.write("\r\nhaha\r\nsdadas");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
