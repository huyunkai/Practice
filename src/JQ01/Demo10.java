/*
 * ʹ�÷���ʱ�ļ�����������.
 * ʹ�÷���ʱ�������������ͣ��������ǻ�����������.
 * ���ֻ�����ע��:
 * @Override:�޶���д���෽��,��ע��ֻ�����ڷ���.
 * @Deprecated:���ڱ�ʾĳ������Ԫ��(��,������)�ѹ�ʱ.
 * @SuppressWarnings:���Ʊ���������.
 * */
package JQ01;

import java.util.ArrayList;
import java.util.List;

public class Demo10 
{
	public static void main(String []args)
	{
		//ArrayList <String>list=new ArrayList<Object>();//����ʹ�÷����Ǵ����.
		//ArrayList<String> list=new ArrayList<String>();
		ArrayList<String>list=new ArrayList<>();
		ArrayList list1=new ArrayList<String>();
		
	}
	public void add(List<? extends Number>list)
	{
			//list.add(100);//ֻҪ�У��Ͳ��ܵ�����������صķ���.
	}
}
