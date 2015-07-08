package Single;

public class Student//强制让学生具备比较性
{
	private String name;
	private int age;
	Student(String name,int age)
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
//	public int compareTo(Object obj) {
//		if(!(obj instanceof Student))
//			throw new RuntimeException("不是学生对象");
//		Student s=(Student)obj;
//		System.out.println(this.name+".compareto.."+s.name);
////		if(this.age>s.age)
////			return 1;
////		if(this.age==s.age)
////		{
////			return this.name.compareTo(s.name);//升序排序。
////		}
////		return -1;
//				
//	}
	
	
}
