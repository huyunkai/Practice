/*
 * 删除一个带内容的目录
 * 删除原理：
 * 在window中，删除目录从里面往外删除的.
 * 既然是从里往外删除，就需要用到递归.
 * */
package File;

import java.io.File;

public class RemoveDir {
	private File f1;
	public static void main(String args[])
	{
		File f=new File("D:\\Testdir");
		removedir(f);
	}
	public static void removedir(File f)
	{
		File[] files=f.listFiles();
		for(File f1:files)
		{
			if(f1.isDirectory())
			{
				removedir(f1);
			}
			else
				System.out.println(f1.toString()+"::"+f1.delete());
					
		}
		System.out.println(f+"::"+f.delete());
	}
}
