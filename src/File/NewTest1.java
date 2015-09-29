/*
 * 需求：
 * 有五个学生，每个学生有3门课的成绩,
 * 从键盘输入以上数据(包括姓名,三门课成绩)
 * 输入的格式：如：zhangsan,30,40,60计算出总成绩.
 * 并把学生的信息和计算出的总分数高低顺序存放在磁盘文件"stud.txt中"
 * *
 * 步骤思想：
 * 1，描述学生对象
 * 2,定义一个可操作学生对象的工具类.
 * 思想,
 * 1,通过获取键盘录入一行数据，并将该行数据的信息取出封装成学生对象.
 * 2,因为学生有很多,那么就需要存储，使用到集合.因为要对学生的总分排序.
 *  所以可以使用TreeSet.
 *  3,将集合的信息写入到一个文件中.
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
