/*
 * */

package Single;
/*
 * �����ඨ��ķ��ͣ�������������Ч �����������ʹ�ã�
 * ��ô������Ķ�����ȷҪ�����ľ������ͺ�����Ҫ���������;��Ѿ��̶��ˡ�
 * Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ����
 * ��ô���Խ����Ͷ����ڷ�����
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
