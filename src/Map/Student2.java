package Map;

import java.util.Comparator;

public class Student2 implements Comparator<Student2>{
	private String id;
	private String name;
	public Student2(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student2))
			throw new ClassCastException("¿‡–Õ≤ª∆•≈‰!");
		Student2 stu=(Student2)obj;
		return this.id.equals(stu.id)&&this.name.equals(stu.name);
	}
	public int HashCode()
	{
		return id.hashCode()+name.hashCode();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return id+","+name;
	}
	@Override
	public int compare(Student2 o1, Student2 o2) {
		int num=o1.id.compareTo(o2.id);
		while(num==0)
			return o1.name.compareTo(o2.name);
		return num;
	}
}
