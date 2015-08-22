/*
 * File ��ĳ�������:
 * 1,����
 * 		boolean createNewFile();��ָ��λ�ô����ļ���������ļ��Ѿ����ڣ�
 * 		�򲻴���������false.
 * 		���������һ�������������һ�����������ļ��Ѿ����ڣ��򸲸ǡ�
 * 		boolean mkdir(): �����ļ��С�
 * 		boolean mkdirs():�����༶�ļ��С�
 * 2��ɾ��
 * 		boolean delete();ɾ��ʧ�ܷ���false.
 * 		void deleteOnExit();//�ڳ����˳�ʱɾ��ָ���ļ���
 * 3���ж�.
 * 		canExcute();
 * 		boolean exists(): �ļ��Ƿ���ڡ�
 * 		isFile();
 * 		isDirectory();
 * 		isHidden();
 * 		isAbsolute()://�ж��ļ��Ƿ�Ϊ����·��
 * 4����ȡ��Ϣ��	
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
	//����File����
	public static void consMethod()
	{
		//��a.txt��װ��File���󣬿��Խ����еĺ�δ���ֵ��ļ������ļ��з�װ�ɶ���
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
		//�����ļ���
		File dir=new File("D:\\abc");
		//sop(dir.createNewFile());
		//sop("mkdir="+dir.mkdirs());
		sop(dir.delete());
	}
	public static void Method_3()
	{
		File f=new File("D:\\file.txt");
		//��ס���ж��ļ������Ƿ����ļ�����Ŀ¼ʱ������Ҫ���жϸ��ļ�����
		//��װ�������Ƿ���ڣ�ͨ��exists�ж�.
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
		sop("parent:"+f1.getParent());/*�÷������ص��Ǿ���·���еĸ�Ŀ¼��
		�����ȡ�������·�������ص���null.������·��������һ��Ŀ¼����ô��Ŀ¼���Ƿ��ؽ����*/
		
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
