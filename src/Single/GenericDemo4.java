/*
 * */

package Single;
/*
 * 泛型类定义的泛型，在整个类中有效 ，如果被方法使用，
 * 那么泛型类的对象明确要操作的具体类型后，所有要操作的类型就已经固定了。
 * 为了让不同方法可以操作不同类型，而且类型还不确定，
 * 那么可以将泛型定义在方法中
 * */
public class GenericDemo4 {
	public static void main(String []args)
	{
		Demo<String> d=new Demo<String>();
		d.show(4);
		d.print("asd");
		d.method("adasdas");
//		Demo<Integer> d1=new Demo<Integer>();
//		d1.show(new Integer(4));
//		d1.print(5);
		
	}
}
