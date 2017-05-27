package sort;
/**
 * 封装了一些常用的方法
 * @author Administrator
 *
 */
public class BaseSort {
	
	//交换
	public  void swap(int[] a ,int i,int j){
		int temp = a[i];
		a[i]=a[j] ;
		a[j] = temp;
	}
	
	/**
	 * 
	 * @param a 要打印的数组
	 * @param count 第几次
	 */
	public void printArray(int[] a ,int count){
		System.out.print("第"+count+"次：");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
