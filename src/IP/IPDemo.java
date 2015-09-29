/*
 * UDP:1 面向无连接
 *     2 发送的包有限的一般每个书包大小控制在64K;
 *     3 连接不可靠.
 *     4 不需要连接，速度快.
 * TCP:1 面向连接.
 * 	   2 进行大数据传输.
 * 	   3 通过三次握手完成连接,可靠协议.
 *     4 效率稍低.
 * Socket:为网络服务提供的一种机制.
 *        通信的两端都有Socket.
 *        在两个Socket见通过IO传输.    
 * **/
package IP;

import java.net.InetAddress;

public class IPDemo { 
	public  static void main(String []args)throws Exception
	{
//		InetAddress i=InetAddress.getLocalHost();
//		System.out.println("ipAddress:"+i.getHostAddress());
//		System.out.println("ipHostname:"+i.getHostName());
		InetAddress ia=InetAddress.getByName("www.baidu.com");
		System.out.println("address:"+ia.getHostAddress());
		System.out.println("name:"+ia.getHostName());
	}
}
