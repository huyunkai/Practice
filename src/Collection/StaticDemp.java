/*
 * StaticImport ��̬���롣
 * ����������ʱ����Ҫָ������İ�����
 * ����������ʱָ���߱������Ķ�������ࡣ��
 * */
package Collection;
import static java.lang.System.*;//������System�������о�̬��Ա��
import java.util.Arrays;
import static java.util.Arrays.*;//�������Arrays������е����о�̬��Ա��
public class StaticDemp {
	public static void main(String []args)
	{
		int []arr={3,1,5};
		Arrays.sort(arr);//��������
		int index=binarySearch(arr, 1);
		out.println(index);
		out.println(Arrays.toString(arr));
	}
}
