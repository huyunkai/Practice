/*
 * RamdomAccessFile
 * ���಻����IO��ϵ������
 * ����ֱ�Ӽ̳���Object
 * ��������IO���еĳ�Ա����Ϊ���߱�����д����.
 * 
 * �ڲ���װ��һ�����飬����ͨ��ָ��������Ԫ�ؽ��в���.
 * ����ͨ��getFilePointer��ȡָ��λ��,
 * ͬʱ����ͨ��seek�ı�ָ���λ��.
 * 
 * ��ʵ��ɶ�д��ԭ������ڲ���װ���ֽ��������������.
 * ͨ�����캯�����Կ���������ֻ�ܲ����ļ�.
 * ���Ҳ����ļ�����ģʽ��ֻ��r,,��дrw��.
 * ���ģʽΪֻ�������ᴴ���ļ�����ȥ��ȡһ���Ѵ��ڵ��ļ�.������ļ��������������쳣.
 * ���ģʽΪrw.��ô�����ļ������ڣ����Զ���������������򲻻Ḳ��
 * ���Ҹö���Ĺ��캯��Ҫ�������ļ������ڣ����Զ�������������ڲ��Ḳ��.
 * */
package File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RamdomAccessFileDemo {
	public static void main(String []args)throws IOException
	{
		writeFile_2();
		//readFile();
	}
	public static void readFile() throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile("ran.txt","r");
		//����������ָ��
		//raf.seek(8*1);����������Ҳ������ǰ��
		//����ָ�����ֽ���
		raf.skipBytes(8*1);//ֻ�������߲�����ǰ��
		byte []buf=new byte[4];
		int len=0;
		while((len=raf.read(buf))!=-1)
		{
		String name=new String(buf);
		int age=raf.readInt();
		System.out.println("name="+name);
		System.out.println("age="+age);
		}
		raf.close();
	}
	public static void writeFile_2()throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile("ran.txt", "rw");
		raf.seek(8*3);
		raf.write("����".getBytes());
		raf.writeInt(103);
		raf.close();
		
	}
	public static void writeFile()throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile("ran.txt", "rw");
		raf.write("����".getBytes());
		raf.writeInt(97);
		raf.write("����".getBytes());
		raf.writeInt(99);
		raf.close();
	}
}
