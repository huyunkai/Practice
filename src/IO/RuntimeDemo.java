/*
 * Runtime对象
 * 该类并没有提供构造函数。
 * 说明不可以以new对象，那么会直接想到该类中的方法都是静态的。
 * 发现该类中还有非静态方法。
 * 说明该类肯定会提供了方法获取非类对象，而且该方法是静态的，并返回值类型是本类类型。
 * 该方式是static getRuntime(); 
 *  **/
package IO;

public class RuntimeDemo {	
	public static void main(String []args) throws Exception
	{
		Runtime t=Runtime.getRuntime();
		Process p=t.exec("notepad.exe");
		Thread.sleep(4000);//4秒内关闭程序
		p.destroy();//杀进程的方法。
	}
	public static void sop(Object obj) 
	{
		System.out.println(obj);
	}

}
