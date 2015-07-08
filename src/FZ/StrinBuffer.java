/*
 * Stringbuffer是字符串缓冲区
 * 是一个容器.
 * 缓冲区的三个特点：
 * 1 而且长度是可变化的.
 * 2 可以字节操作多个数据类型。
 * 3 最终会通过toString方法变成字符串。
 * 1 存储
 *   StringBuffer append(): 将指定的数据作为参数添加已有数据的结尾处。
 *   StringBuffer insert(index,数据):可以将数据插入到指定index 位置。
 * 2 删除
 *   StringBuffer delete(start,end):删除缓存区的数据，包含start，不包含end。
 *   StringBUffer deleteCharAt(index):删除指定位置的字符。
 * 3 获取。
 *   char charAt(int index);
 *   int indexOf(String str):
 *   int lastIndexOf(String str):
 *   int length():
 *   String subString(int start,int end):
 * 4 修改.
 *   StringBuffer replace(start,end,string);
 *   void setCharAt(int index,char ch);
 * 5,反转。
 * StringBuffer reverse();
 * 6,void getChars(int srcBegin,int srcEnd.char []dst,int dstBegin);
 *    //将缓冲区中指定数据存储到指定字符数组中
 * JDK 1.5版本之后出现了StringBuilder.
 * StringBuffer是线程同步。
 * StringBuilder是线程不同步.
 * 以后开发，建议使用StringBuilder 
 * 升级三个因素：
 * 1、提高效率。
 * 2，简化书写。
 * 3、提高安全性。
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
		//清空缓冲区
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
