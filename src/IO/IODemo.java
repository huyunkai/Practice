/*
 * IO流用来处理设备之间的数据传输。
 * Java对数据的操作是通过流的方式。
 * Java用于操作流的对象都在IO包中。
 * 数据分：字节流和字符流。
 * 流向：输入流和输出流。
 * 字节流的抽象基类：
 * InputStream,OutputStream.
 * 字符流的抽象基类：
 * Reader,Writer.
 * 字符流的特点：
 * 既然IO适用于操作数据的。
 * 数据的最常见体现形式是：文件。
 * 
 * 那么先已操作文件为主来演示。
 * 需求：在硬盘上，创建一个文件，并写入一些文字数据。
 * 找到一个专门用于操作文件的Writer子类对象 FileWriter.后缀名是父类名。前缀名改流对象的功能。
 * */
package IO;

import java.io.FileWriter;

public class IODemo {
	public static void main(String []args)throws Exception
	{
		//创建一个FileWriter对象，改对象一被初始化就必须要被操作的文件。
		//而且该文件会被创建到指定目录下。如果该目录已有同名文件，将被覆盖。
		//其实该步就是明确数据要存放的目的地。
		FileWriter fw=new FileWriter("demo.txt");
		//调用write方法，将字符串写入到流中。
		fw.write("abcde");
		fw.write("hah");
		fw.write("mimi");
		//刷新流对象中的缓冲区中。
		//fw.flush();
		//关闭流资源但是关闭之前会刷新一次内部的缓冲中的数据，将数据刷到目的地中
		//和flush区别：flash刷新后，流可以继续使用，close刷新后，会自动关闭。
		fw.close();
		//fw.write("asda");
	}
}
