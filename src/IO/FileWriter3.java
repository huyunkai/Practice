/*
 * ��ʾ�������ļ���������д��
 * */
package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter3 {
	public static void main(String []args)
	{
		//����һ��true�����������������е��ļ������������ļ���ĩβ��������д��
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
