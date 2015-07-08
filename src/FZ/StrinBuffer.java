/*
 * Stringbuffer���ַ���������
 * ��һ������.
 * �������������ص㣺
 * 1 ���ҳ����ǿɱ仯��.
 * 2 �����ֽڲ�������������͡�
 * 3 ���ջ�ͨ��toString��������ַ�����
 * 1 �洢
 *   StringBuffer append(): ��ָ����������Ϊ��������������ݵĽ�β����
 *   StringBuffer insert(index,����):���Խ����ݲ��뵽ָ��index λ�á�
 * 2 ɾ��
 *   StringBuffer delete(start,end):ɾ�������������ݣ�����start��������end��
 *   StringBUffer deleteCharAt(index):ɾ��ָ��λ�õ��ַ���
 * 3 ��ȡ��
 *   char charAt(int index);
 *   int indexOf(String str):
 *   int lastIndexOf(String str):
 *   int length():
 *   String subString(int start,int end):
 * 4 �޸�.
 *   StringBuffer replace(start,end,string);
 *   void setCharAt(int index,char ch);
 * 5,��ת��
 * StringBuffer reverse();
 * 6,void getChars(int srcBegin,int srcEnd.char []dst,int dstBegin);
 *    //����������ָ�����ݴ洢��ָ���ַ�������
 * JDK 1.5�汾֮�������StringBuilder.
 * StringBuffer���߳�ͬ����
 * StringBuilder���̲߳�ͬ��.
 * �Ժ󿪷�������ʹ��StringBuilder 
 * �����������أ�
 * 1�����Ч�ʡ�
 * 2������д��
 * 3����߰�ȫ�ԡ�
 * */
package FZ;

public class StrinBuffer{
	public static void method_update()
	{
		StringBuilder sb=new StringBuilder("asaca");
		sb.replace(1, 4, "java");
		sop(sb);
		sb.setCharAt(2, 'k');
		sop(sb);
	    char []chs=new char[4];
	    
		sb.getChars(0, 4, chs, 0);
		for(int x=0;x<chs.length;x++)
		{
			sop("chs["+x+"]="+chs[x]+";");
		}
	}
	public static void method_delete()
	{
		StringBuffer sb=new StringBuffer("acsacsa");
		
		//sb.delete(1, 3);
		//��ջ�����
		//sb.delete(0, sb.length());
		sb.deleteCharAt(2);
		sop(sb.toString());
		
	}
	
   public static void main(String []args)
   {
	   StringBuffer sb=new StringBuffer();
	   StringBuffer sb1=sb.append(34).append("ADC").append(true);
//	   sop("sb==sb1:"+(sb==sb1));
//	   
//	   sop(sb1.toString());
//	   sb.insert(1, "qq");
//	   sop(sb.toString());
	  // method_delete();
	   method_update();
   }
   public static void sop(Object obj)
   {
	   System.out.println(obj);
   }
}
