/*
 * System:�����еķ��������Զ��Ǿ�̬��.
 * out:��׼�����Ĭ���ǿ���̨��
 * in:��ע���룬Ĭ���Ǽ��̡�
 * ����ϵͳһЩ��Ϣ�� Properties getProperties(); 
 * */
package IO;
import java.util.Properties;
import java.util.Set;

public class SystemDemo {
	public static void main(String []args)
	{
		Properties prop =System.getProperties();
		//��ΪProperties��Hashtable�����࣬Ҳ����Map���ϵ�һ���������
		//��ô����ͨ��map����ȡ���ü����е�Ԫ��
		//�ü����д洢�����ַ�����û�з��Ͷ��塣
		 
		
		
		//�����ϵͳ���Զ���һЩ��������Ϣ�أ�
		
		System.setProperty("mykey", "myvalue");
		//��ȡָ��������Ϣ��
		String value=System.getProperty("os.name");
		sop("value="+value);
		
		//�ɲ����������������ʱ��̬�ļ���һЩ������Ϣ�أ�
		
		String v=System.getProperty("haha");
		sop("v="+v);
		//��ȡ����������Ϣ��
		
//		for(Object obj:prop.keySet())
//		{
//			String value=(String)prop.get(obj);
//			//sop(obj+":"+value);
//		}
//		Set<String> key=prop.stringPropertyNames();
//		for(String i:key)
//		{
//			sop(i+"::"+prop.getProperty(i));
//		}
//		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
