/*
 * ����
 * ����һ��ͼƬ
 * ˼·��
 * 1�����ֽڶ�ȡ�������ͼƬ������
 * 2�����ֽ�д�������󴴽�һ��ͼƬ�ļ�.���ڴ洢��ȡ����ͼƬ����.
 * 3,ͨ��ѭ����д��������ݵĴ洢.
 * 4���ر���Դ
 * */
package Buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPic {
	public static void main(String []args)
	{
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try
		{
			fos =new FileOutputStream("D:\\2.jpg");
			fis=new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
			byte []buf=new byte[1024];
			int len=0;
			while((len=fis.read(buf))!=-1)
			{
				fos.write(buf,0,len);
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException("�����ļ�ʧ��!");
		}
		finally
		{
			try
			{
			if(fis!=null)
			{
				fis.close();
			}
			}
			catch(IOException e)
			{
				throw new RuntimeException("��д�ļ�ʧ��!");
			}
			
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("д���ļ�ʧ�ܣ�");
				}
			}
			
		}
	
	
	}	
}	
