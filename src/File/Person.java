package File;

import java.io.Serializable;

public class Person implements Serializable{
	public static final long serialVersionUID=42L;
	private String name;
	transient int age;//保证在堆内存中存在而不存在文件中而不能被序列化.
	static String country="cn";//静态是不能被序列化.只能把堆里面的数据序列化
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
