/*
 * Runtime����
 * ���ಢû���ṩ���캯����
 * ˵����������new������ô��ֱ���뵽�����еķ������Ǿ�̬�ġ�
 * ���ָ����л��зǾ�̬������
 * ˵������϶����ṩ�˷�����ȡ������󣬶��Ҹ÷����Ǿ�̬�ģ�������ֵ�����Ǳ������͡�
 * �÷�ʽ��static getRuntime(); 
 *  **/
package IO;

public class RuntimeDemo {	
	public static void main(String []args) throws Exception
	{
		Runtime t=Runtime.getRuntime();
		Process p=t.exec("notepad.exe");
		Thread.sleep(4000);//4���ڹرճ���
		p.destroy();//ɱ���̵ķ�����
	}
	public static void sop(Object obj) 
	{
		System.out.println(obj);
	}

}
