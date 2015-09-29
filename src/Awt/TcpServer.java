package Awt;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ����ˣ�
 * ����:����˵�������ݱ���ӡ�ڿ���̨��.
 * 1,��������˵�socket����,serverSocket();
 * ������һ���˿�.
 * 2����ȡ���ӹ����Ŀͻ��˶���.
 * ͨ��serverSocket��accept����.�����������������ʽ��.
 * 3,�ͻ��������������,��ô�����Ҫʹ�ö�Ӧ�Ŀͻ��˶��󣬱���ȡ���ÿͻ��˶����
 * ��ȡ������ȡ�����������ݣ�����ӡ�ڿ���̨.
 * 4,�رշ����.����ѡ����.��
 * 
 * 
 * */
public class TcpServer 
{
	public static void main(String []args)throws Exception
	{
		//��������˵�Scoket���񲢼���һ���˿�.
		ServerSocket ss=new ServerSocket(10003);
		//ͨ��accept������ȡ���ӹ����Ŀͻ��˶���.
		Socket s=ss.accept();
		//��ȡ�ͷ��˷��͹��������ݣ���ôҪʹ�ÿͻ��˶���Ķ�ȡ������ȡ����.
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connect");
		InputStream in=s.getInputStream();
		byte []buf=new byte[1024];
//		int len=in.read(buf);
//		System.out.println(new String(buf,0,len));
		int len=0;
		while((len=in.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}
		s.close();
		ss.close();
		
	}
}
