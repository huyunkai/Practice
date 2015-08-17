/*
 * �ַ�����
 * FileReader
 * FileWriter
 * 
 * BufferedReader
 * BufferedWriter
 * 
 * �ֽ���
 * FileInputStream 
 * FileOutputStream
 * 
 * BufferedInputStream
 * BufferedOutputStream
 * ͨ���ղŵļ���¼��һ�����ݲ���ӡ���д��������ʵ���Ƕ�һ�����ݵ�ԭ��
 * Ҳ����readLine������
 * 
 * �ܲ���ֱ��ʹ��readLine��������ɼ���¼���һ�����ݵĶ�ȡ�أ�
 * readLine�ķ�����BufferedReader���еķ�����
 * ������¼��read�ķ�����InputStream�ķ���.
 * 
 * ��ô�ܲ��ܽ��ֽ���ת���ַ�������ʹ���ַ�����������readLine�ķ���.
 * */
package Buffer;
import java.io.*;
public class TranStreamDemo {

	public static void main(String[] args) {
		//��ȡ����¼�����
//		InputStream in=System.in;
//		//���ֽ�������ת���ַ�������ʹ��ת������InputStreamReader.
//		InputStreamReader isr=new InputStreamReader(in);
//		//Ϊ�����Ч�ʣ����ַ������л�����������Ч������ʹ��BufferedReader.
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
		//����¼�����д��.
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
			throw new RuntimeException("��дʧ�ܣ�");
			
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
