/*
 * StaticImport 静态导入。
 * 当类名重名时，需要指定具体的包名。
 * 当方法重名时指定具备所属的对象或者类。，
 * */
package Collection;
import static java.lang.System.*;//导入了System类中所有静态成员。
import java.util.Arrays;
import static java.util.Arrays.*;//导入的是Arrays这个类中的所有静态成员。
public class StaticDemp {
	public static void main(String []args)
	{
		int []arr={3,1,5};
		Arrays.sort(arr);//排序后查找
		int index=binarySearch(arr, 1);
		out.println(index);
		out.println(Arrays.toString(arr));
	}
}
