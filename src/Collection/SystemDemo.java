/**
 * System:
 * ����ϵͳһЩ��Ϣ��
 * ��ȡϵͳ������Ϣ��Properties getProperties();
 * 
 * */
package Collection;

import java.util.Properties;

public class SystemDemo {
	public static void main(String []args)
	{
		Properties prop=System.getProperties();
		//��ΪProperties��Hashable�����࣬Ҳ����Map���ϵ�һ���������
		//��ô����ͨ��Map�ķ���ȡ���ü����е�Ԫ�ء�
		
		System.out.println(prop);
	}
}
