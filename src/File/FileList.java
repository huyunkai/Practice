/*
 * ��ϰ��
 * ��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����洢��һ���ı��ļ���.
 * ����һ��java�ļ��б��ļ�.
 * 
 * ˼·:
 * 1,��ָ����Ŀ¼���еݹ�.
 * 2,��ȡ�ݹ���������е�java�ļ���·��.
 * 3,����Щ·���洢��������.
 * */
package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileList {
	public static void main(String []args)
	{
		File f=new File("D:\\java\\Practice");
		List<File> list=new ArrayList<File>();
		fileToList(f, list);
		File f1=new File("D:\\newTest");
		try {
			writeToFile(list, f1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("����ʱ����!");
		}
		//System.out.println(list.size());
	}
	public static void fileToList(File f,List <File> list)
	{
		File [] files=f.listFiles();
		for(File f1:files)
		{
			if(f1.isDirectory())
			 fileToList(f1, list);
			else
			{
				if(f1.getName().endsWith(".java"));
				list.add(f1);
			}
		}
	}	
	public static void writeToFile(List<File>list,String FileList) throws IOException
	{
		BufferedWriter bufw=null;
		try
		{
			bufw=new BufferedWriter(new FileWriter(FileList));
			for(File f:list)
			{
				String path=f.getAbsolutePath();
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
				
			}
		}
		catch(IOException e)
		{
			throw e; 
		}
		finally
		{
			try{
			if(bufw!=null)
				bufw.close();
			}
			catch(IOException e)
			{
				throw e;
			}
		}
	}
}
