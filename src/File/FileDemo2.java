package File;

import java.io.File;

public class FileDemo2 {
	public static void main(String []args)
	{
		listDemo();
	}
	public static void listDemo()
	{
		File f=new File("D:\\");
		String []names=f.list();/*����list������file��������Ƿ�װ��һ��Ŀ¼��
		��Ŀ¼�������.*/
		for(String name:names)
		{
			System.out.println(name);//��ӡ��D���µ�����Ŀ¼��
		}
	}
	public static void listRootsDemo()
	{
		File[] files=File.listRoots();
		for(File f:files)
		{
			System.out.println(f+":"+f.length());
		}
	}
}
