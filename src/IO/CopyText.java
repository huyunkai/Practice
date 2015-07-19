/*
 * ��C��һ���ı��ļ����Ƶ�D�̡�
 * 
 * ����ԭ����ʵ���ǽ�c���µ��ļ����ݴ洢��D�̵�һ���ļ��С�
 * ���裺
 * 1,��D�̴���һ���ļ�,���ڴ洢c���ļ��е����ݡ�
 * 2�������ȡ����c���ļ�������
 * 3��ͨ�����ϵĶ�д������ݴ洢��
 * 4���ر���Դ��
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
		//����Ŀ�ĵء�
		FileWriter fw=new FileWriter("D:\\fileone.java");
		//�������ļ�������
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
           throw new RuntimeException("��дʧ�ܣ�");			
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
