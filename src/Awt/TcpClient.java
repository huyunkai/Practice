package Awt;

import java.io.OutputStream;
import java.net.Socket;

public class TcpClient 
{
	public static void main(String []args)throws Exception
	{
		//创建客户端的socket服务，指定目的主机和端口.
		Socket s=new Socket("127.0.0.1",10003);
		//为了发送数据，应该获取socket流中的输出流.
		OutputStream os=s.getOutputStream();
		os.write("tcp lai le".getBytes());
		s.close();
	}
}
