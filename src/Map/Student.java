package Map;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int hashCode()
	{
		return name.hashCode()+age*43;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("¿‡–Õ≤ª∆•≈‰!");
		Student stu=(Student)obj;
		return this.name.equals(stu.name)&&this.age==stu.age;
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
	public String toString()
	{
		return name+":"+age;
	}
	@Override
	public int compareTo(Student o) {
		int num=new Integer(this.age).compareTo(new Integer(o.age));
		if(num==0)
			return this.name.compareTo(o.name);
		return num;
	}

}
