/*
 * ɾ��һ�������ݵ�Ŀ¼
 * ɾ��ԭ��
 * ��window�У�ɾ��Ŀ¼����������ɾ����.
 * ��Ȼ�Ǵ�������ɾ��������Ҫ�õ��ݹ�.
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
