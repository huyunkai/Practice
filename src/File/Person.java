package File;

import java.io.Serializable;

public class Person implements Serializable{
	public static final long serialVersionUID=42L;
	private String name;
	transient int age;//��֤�ڶ��ڴ��д��ڶ��������ļ��ж����ܱ����л�.
	static String country="cn";//��̬�ǲ��ܱ����л�.ֻ�ܰѶ�������������л�
	Person(String name,int age,String country)
	{
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public String toString()
	{
		return name+":"+age+":"+country;
	}
}
