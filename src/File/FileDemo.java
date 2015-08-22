/*
 * File 类的常见方法:
 * 1,创建
 * 		boolean createNewFile();在指定位置创建文件，如果该文件已经存在，
 * 		则不创建，返回false.
 * 		和输出流不一样，输出流对象一建立，而且文件已经存在，则覆盖。
 * 		boolean mkdir(): 创建文件夹。
 * 		boolean mkdirs():创建多级文件夹。
 * 2，删除
 * 		boolean delete();删除失败返回false.
 * 		void deleteOnExit();//在程序退出时删除指定文件。
 * 3，判断.
 * 		canExcute();
 * 		boolean exists(): 文件是否存在。
 * 		isFile();
 * 		isDirectory();
 * 		isHidden();
 * 		isAbsolute()://判定文件是否为绝对路径
 * 4，获取信息。	
 * 	String getName();
 * 		   getPath();
 * 		   getParent();
 * 		   getAbsolutePath();
 * 	long   LastModified();
 * 	long   length();
 * 		   
 * */
package File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public  static void main(String []args)
	{
		//consMethod();
			Method_5();
		
	}
	//创建File对象
	public static void consMethod()
	{
		//将a.txt封装成File对象，可以将已有的和未出现的文件或者文件夹封装成对象
		File f=new File("D:"+File.separator+"a.txt");
		//
		File f1=new File("D:"+File.separator+"abc","b.txt");
		
		File f2=new File("D:"+File.separator+"abc");
		File f3=new File(f2,"c.txt");
		 sop("f:"+f);
		 sop("f1:"+f1);
		 sop("f3:"+f3);
		 File f4=new File("D:"+File.separator+"abc"+File.separator+"zzz"+File.separator+"a.txt");
		 sop(f4);
	}
	public static void Method_1()
	{
		File f=new File("D:\\abc.txt");
		//sop("create="+f.createNewFile());
		sop("delete="+f.delete());
	}
	public static void Method_2() throws IOException
	{
		File f=new File("FileDemo.java");
		//sop("exist:"+f.exists());
		//sop("execute="+f.canExecute());
		//创建文件夹
		File dir=new File("D:\\abc");
		//sop(dir.createNewFile());
		//sop("mkdir="+dir.mkdirs());
		sop(dir.delete());
	}
	public static void Method_3()
	{
		File f=new File("D:\\file.txt");
		//记住在判断文件对象是否是文件或者目录时，必须要先判断该文件对象
		//封装的内容是否存在，通过exists判断.
		try {
			f.createNewFile();
			f.delete();
			f.mkdir();
			f.delete(); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sop("dir:"+f.isDirectory());
		sop("file:"+f.isFile());
		sop(f.isAbsolute());
	}
	public static void Method_4()
	{
		File f=new File("D:\\abc");
			f.mkdir();
			File f1=new File("abc\\abc.txt");
				
//		sop("path:"+f.getPath());
//		sop("abspath:"+f.getAbsolutePath());
		sop("parent:"+f1.getParent());/*该方法返回的是绝对路径中的父目录。
		如果获取的是相对路径，返回的是null.如果相对路径中有上一层目录，那么该目录就是返回结果。*/
		
	}
	public static void Method_5()
	{
		File f1=new File("D:\\abc\\abc.txt");
		File f2=new File("D:\\hahaha.java");
		sop("remove:"+f2.renameTo(f1));
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
