package Awt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * �����
 * Դ��socket��ȡ��.
 * Ŀ��:socket�����.
 * �����ı�������װ��.
 * */
public class TransServer 
{
	public static void main(String []args)throws Exception
	{
		ServerSocket ss=new ServerSocket(10005);
		Socket s=ss.accept();
		//��ȡsocket��ȡ���е�����.
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//Ŀ��:socket�����,����д����д�뵽socket�����,�����͸��ͻ���.
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line=null;
		while((line=bufIn.readLine())!=null)
		{
			bufw.write(line.toUpperCase());
		}
		s.close();
		ss.close();
	}
}
/*
 * �����ӳ��ֵ�����. 
 * ���󣺿ͻ��˺ͷ���˶���Ī���ĵȴ���
 * �ͷ��˺ͷ���˶�������ʽ��������Щ����û�ж���������ǣ���ô��һֱ�ȴ�.
 * */
