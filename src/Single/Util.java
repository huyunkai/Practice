package Single;
//泛型类。
/*
 * 什么时候定义泛型类？
 * 当类中要操作的引用数据类型不确定的时候，
 * 早期定义Object来完成扩展。
 * 现在定义泛型来完成扩展。
 * */
public class Util<QQ> {
	private QQ q;
	public void setObject(QQ q)
	{
		this.q=q;
	}
	public QQ getObject()
	{
		return q;
	}
}
