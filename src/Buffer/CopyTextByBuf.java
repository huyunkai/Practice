/*
 * ͨ������������һ��.java�ļ�.
 * readline�������ص�ʱ��ֻ���ػس���֮ǰ���������ݣ��������ػس���.
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
			throw new RuntimeException("��дʧ�ܣ�");
		}
		finally
		{
			try {
				if(bufr!=null)
				bufr.close();
			} catch (IOException e) {
				throw new RuntimeException("��ȡ�ر�ʧ�ܣ�");
			}
			try {
				bufw.close();
			} catch (IOException e) {
				throw new RuntimeException("д��ر�ʧ�ܣ�");
			}
		}
		}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}