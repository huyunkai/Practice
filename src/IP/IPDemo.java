/*
 * UDP:1 ����������
 *     2 ���͵İ����޵�һ��ÿ�������С������64K;
 *     3 ���Ӳ��ɿ�.
 *     4 ����Ҫ���ӣ��ٶȿ�.
 * TCP:1 ��������.
 * 	   2 ���д����ݴ���.
 * 	   3 ͨ�����������������,�ɿ�Э��.
 *     4 Ч���Ե�.
 * Socket:Ϊ��������ṩ��һ�ֻ���.
 *        ͨ�ŵ����˶���Socket.
 *        ������Socket��ͨ��IO����.    
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
