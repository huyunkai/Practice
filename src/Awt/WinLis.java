package Awt;

public class WinLis implements Lis {

	@Override
	public void close() {
		//覆盖了7个方法，可以我只用了关闭的动作.
		//其他动作都没有用到，可是去必须复写.

	}
/*
 * 因为WindowListener的子类windowAdapter已经实现了 windowListener接口
 * 比覆盖了其中的所有方法,那么我只有继承自windowadapter覆盖我需要的方法即可.
 * 
 * */
}
