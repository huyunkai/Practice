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
		String []names=f.list();/*调用list方法的file对象必须是封装了一个目录。
		该目录必须存在.*/
		for(String name:names)
		{
			System.out.println(name);//打印出D盘下的所有目录。
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
