package Single;
/*
 * ��̬���������Է������˶���ķ��͡�
 * �����̬���������������������Ͳ�ȷ�������Խ����Ͷ����ڷ����ϡ�
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
