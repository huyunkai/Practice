/*
 * ����
 * �����ѧ����ÿ��ѧ����3�ſεĳɼ�,
 * �Ӽ���������������(��������,���ſγɼ�)
 * ����ĸ�ʽ���磺zhangsan,30,40,60������ܳɼ�.
 * ����ѧ������Ϣ�ͼ�������ܷ����ߵ�˳�����ڴ����ļ�"stud.txt��"
 * *
 * ����˼�룺
 * 1������ѧ������
 * 2,����һ���ɲ���ѧ������Ĺ�����.
 * ˼��,
 * 1,ͨ����ȡ����¼��һ�����ݣ������������ݵ���Ϣȡ����װ��ѧ������.
 * 2,��Ϊѧ���кܶ�,��ô����Ҫ�洢��ʹ�õ�����.��ΪҪ��ѧ�����ܷ�����.
 *  ���Կ���ʹ��TreeSet.
 *  3,�����ϵ���Ϣд�뵽һ���ļ���.
 * 
 * 
 */
package File;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

import Collection.Collection;

public class NewTest1 {

	public static void main(String[] args)throws IOException {
		Comparator<Student> cmp=Collections.reverseOrder();
		Set<Student> stus=StudentInfoTool.getStudents(cmp);
		StudentInfoTool.WriteFile(stus);

	}

}
