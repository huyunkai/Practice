/*
 * Properties��hashtable������.
 * Ҳ����˵���߱�map���ϵ��ص㣬����������洢�ļ�ֵ�Զ����ַ���.
 * �Ǽ����к�IO�������ϵļ�������.
 * �ö�����ص�:�������ڼ�ֵ����ʽ�������ļ�.
 * ��ô�ڼ�������ʱ����Ҫ�����й̶���ʽ����ֵ.
 * */
package File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String []args)throws IOException
	{
		//setAndGet();
		//method_1();	
		loadDemo();
	}
	public static void loadDemo()throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\1.txt");
		//�����е����ݼ��ؽ�����
		prop.load(fis);
		prop.setProperty("2", "kk");
		FileOutputStream fos=new FileOutputStream("D:\\1.txt");
		prop.store(fos, "newfile");
		//System.out.println(prop);
		prop.list(System.out);
		fis.close();
		fos.close();
		
	}
	//���úͻ�ȡԪ��
	//��info.txt�м�ֵ���ݴ浽�����н��в�����
	/*
	 * 1,��һ������info.txt�ļ�����.
	 * 2,��ȡһ�����ݣ�������������"="���зָ�.
	 * 3���Ⱥ������Ϊ�����ʱ���Ϊֵ�����뵽Properties�����м��ɡ�
	 * 
	 * */
	public static void method_1()
	{
		BufferedReader bufr=null;
	
		try{
		bufr=new BufferedReader(new FileReader("D:\\1.txt"));
		String line=null;
		Properties prop=new Properties();
		while((line=bufr.readLine())!=null)
		{
			String []arr=line.split("=");
			//System.out.println(arr[0]+"..."+arr[1]);
			prop.setProperty(arr[0],arr[1]);
		}
			System.out.println(prop);
		}
		catch(IOException e)
		{
			throw new RuntimeException("��ȡ����ʧ�ܣ�");
		}
		finally
		{
			try {
				bufr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
		
	}
	public static void setAndGet()
	{
		Properties prop=new Properties();
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "21");
//		System.out.println(prop);
		String value=prop.getProperty("lisi");
		//System.out.println(value);
		prop.setProperty("lisi", 89+"");
		Set<String> names=prop.stringPropertyNames();
		for(String s:names)
		{
			System.out.println(s+"::"+prop.getProperty(s));
		}
	}
	
}
