/*
 * ���ڼ�¼Ӧ�ó������д���.
 * ���ʹ�ô����ѵ�����ô����ע����ʾ.
 * �������뵽���ǣ�������.
 * ���Ǹü����������ڳ����У����ų�������ж����ڴ��д��ڲ�����������.
 * �������Ÿ�Ӧ�ó�����˳�,�ü��������ڴ�����ʧ��
 * ��һ���������򣬴��¿�ʼ��0����.
 * ����ʹ������,�ü�������ֵҲ����.
 * �´γ����������ȼ��ؼ�������ֵ����1��洢����.
 * ���Խ���һ�������ļ������ڼ�¼�������ʹ�ô���.
 * �������ļ�ʹ�ü�ֵ�Ե���ʽ.
 * ���������Ķ����ݱ���������.
 * ��ֵ��������map����.
 * ���������ļ���ʽ�洢,ʹ��IO
 * map+io����-->Properties.
 * �����ļ�����ʵ��Ӧ�ó������ݵĹ���.
 * 
 * */
package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CountDemo {
	public static void main(String []args) throws IOException
	{
		Properties prop=new Properties();
		
		File file=new File("count.ini");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		int count=0;
		String value=prop.getProperty("time");
		if(value!=null)
		{
		count=Integer.parseInt(value);
		if(count>=5)
		{
			System.out.println("����,ʹ�ô����ѵ�,��Ǯ");
			return ;
		}
		}
		count++;
		prop.setProperty("time", count+"");
		FileOutputStream fos=new FileOutputStream(file);
		prop.store(fos, "");
		fos.close();
		fis.close();
	}
}
