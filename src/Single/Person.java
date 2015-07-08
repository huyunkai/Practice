package Single;

public class Person {
  private String name;
  private int age;
  Person(String name,int age)
  {
	  this.name=name;
	  this.age=age;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	public int hashCode()
   {
		System.out.println(this.name+"...HashCode()");
	    return name.hashCode()+age*122;//��֤hashcodeֵ��Ψһ��
	}
//�����Զ��Ƚ������ַ�����ֵ�Ƿ���ͬ
public boolean equals(Object obj)
 {
	 if(!(obj instanceof Person))
	 return false;
	 Person p=(Person)obj;
	 System.out.println(this.name+"equals..."+p.name);
	 return this.name.equals(p.name)&& this.age==p.age;
 }
public String toString()
{
	return "111";
}
}
