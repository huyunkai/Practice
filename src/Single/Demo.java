package Single;
/*
 * 静态方法不可以访问泪伤定义的泛型。
 * 如果静态方法操作的引用数据类型不确定，可以将泛型定义在方法上。
 * */
public class Demo<T> {

	public<T> void show(T t)
	{
		System.out.println("show:"+t);
	}
	public void print(T t)
	{
		System.out.println("print:"+t);
	}
	public static<W> void method(W t)
	{
		System.out.println("method:"+t);
	}
}
