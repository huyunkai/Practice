/*
 * TreeSet:可以对Set集合进行排序。
 *         底层数据结构式二叉树。
 *         保证元素唯一性的依据。
 *         compareTo方法 return 0.
 *         TreeSet排序的第一种方式：让元素自身具备比较性。元素需要实现
 *         Comparable接口，覆盖compareTo犯法。
 *         这种方式也称为元素的自然顺序，或者是默认顺序。
 *         TreeSet的第二种排序方式：
 *         当元素自身不具备比较性时，或者具备的比较性不是所需要的。
 *         这时就需要让集合自身具备比较性。
 *         在集合初始化时，就有课比较方式。
 *         
 *         
 *         
 *         
 * 需求：往TreeSet集合中存储自定义对象学生。
 * 想按照学生的年龄进行排序
 *  记住：排序时，当主要条件相同时，一定要判断次要条件。
 * */
package Single;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String  []args)
  {
	  TreeSet<Student> ts=new TreeSet<Student>();
	  ts.add(new Student("lisi01",22));
	  ts.add(new Student("lisi02",21));
	  ts.add(new Student("lisi05",21));
	  ts.add(new Student("lisi03",26));
	  ts.add(new Student("lisi04",27));
	 Iterator it=ts.iterator();
	  while(it.hasNext())
	  {
		  Student stu=(Student)it.next();
		  sop(stu.getName()+"..."+stu.getAge());
	  }
	  
  }
  public static void sop(Object obj)
  {
	  System.out.println(obj);
  }
}
