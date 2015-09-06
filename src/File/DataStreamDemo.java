/*
 * 可以用于操作基本数据类型的流对象.
 * */
package File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DataStreamDemo {
	public static void main(String []args)throws IOException
	{
		//writeData();
		//readData();
		//writeUTFDemo();
		readUTFDemo();
		//writeUTF();
		
	}
	public static void readUTFDemo()throws IOException
	{
		DataInputStream dis=new DataInputStream(new FileInputStream("utfdata.txt"));
		String s=dis.readUTF();
		System.out.println(s);
		dis.close();
	}
	public static void writeUTF()throws IOException
	{
		OutputStreamWriter dos=new OutputStreamWriter(new FileOutputStream("utf.txt"),"gbk");
		dos.write("你好");
		dos.close();
	}
	public static void writeUTFDemo()throws IOException
	{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("utfdata.txt"));
		dos.writeUTF("你好！！");
		dos.close();
		
	}
	public static void readData()throws IOException
	{
		DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));
		int num=dis.readInt();
		boolean b=dis.readBoolean();
		double d=dis.readDouble();
		System.out.println("num="+num);
		System.out.println("b="+b);
		System.out.println("d="+d);
		dis.close();
	}
	public static void writeData()throws IOException
	{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.txt"));
		dos.writeInt(1234);
		dos.writeBoolean(true);
		dos.writeDouble(88.3212);
		dos.close();
	}
}
