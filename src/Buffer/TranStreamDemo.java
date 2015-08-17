/*
 * 字符流：
 * FileReader
 * FileWriter
 * 
 * BufferedReader
 * BufferedWriter
 * 
 * 字节流
 * FileInputStream 
 * FileOutputStream
 * 
 * BufferedInputStream
 * BufferedOutputStream
 * 通过刚才的键盘录入一行数据并打印其大写，发现其实就是读一行数据的原理
 * 也就是readLine方法。
 * 
 * 能不能直接使用readLine方法来完成键盘录入的一行数据的读取呢？
 * readLine的方法是BufferedReader类中的方法。
 * 而键盘录入read的方法是InputStream的方法.
 * 
 * 那么能不能将字节流转成字符流，在使用字符流缓冲区的readLine的方法.
 * */
package Buffer;
import java.io.*;
public class TranStreamDemo {

	public static void main(String[] args) {
		//获取键盘录入对象
//		InputStream in=System.in;
//		//将字节流对象转成字符流对象，使用转换流。InputStreamReader.
//		InputStreamReader isr=new InputStreamReader(in);
//		//为了提高效率，将字符串进行缓冲区技术高效操作。使用BufferedReader.
//		BufferedReader buf=new BufferedReader(isr);
//		try {
//			System.setIn(new FileInputStream("C:\\Users\\sony\\workspace\\Prictice\\demo.txt"));
//		} catch (FileNotFoundException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
		
		try {
			System.setOut(new PrintStream("D:\\zz.txt"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		//键盘录入最常见写法.
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
//		OutputStream out=System.out;
//		OutputStreamWriter osw=new OutputStreamWriter(out);
//		BufferedWriter oswt=new BufferedWriter(osw);
		BufferedWriter oswt=new BufferedWriter(new OutputStreamWriter(System.out));
		String line=null;
		try{
		while((line=buf.readLine())!=null)
		{
			if("over".equals(line)) break;
			oswt.write(line);
			oswt.newLine();
			oswt.flush();
		}
		}
		catch(IOException e)
		{
			throw new RuntimeException("读写失败！");
			
		}
		finally
		{
			try
			{
			if(buf!=null)
				buf.close();
			}
			catch(IOException e)
			{
				try {
					oswt.write(e.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					oswt.newLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					oswt.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		}
	}

}
