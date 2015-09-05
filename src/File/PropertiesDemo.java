/*
 * Properties是hashtable的子类.
 * 也就是说它具备map集合的特点，而且它里面存储的键值对都是字符串.
 * 是集合中和IO技术相结合的集合容器.
 * 该对象的特点:可以用于键值对形式的配置文件.
 * 那么在加载数据时，需要数据有固定格式，键值.
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
		//将流中的数据加载进集合
		prop.load(fis);
		prop.setProperty("2", "kk");
		FileOutputStream fos=new FileOutputStream("D:\\1.txt");
		prop.store(fos, "newfile");
		//System.out.println(prop);
		prop.list(System.out);
		fis.close();
		fos.close();
		
	}
	//设置和获取元素
	//将info.txt中键值数据存到集合中进行操作。
	/*
	 * 1,用一个流和info.txt文件关联.
	 * 2,读取一行数据，并将行数据用"="进行分割.
	 * 3，等号左边作为键，邮编作为值，存入到Properties集合中即可。
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
			throw new RuntimeException("读取数据失败！");
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
