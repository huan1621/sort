package sort;
/**
 * ��װ��һЩ���õķ���
 * @author Administrator
 *
 */
public class BaseSort {
	
	//����
	public  void swap(int[] a ,int i,int j){
		int temp = a[i];
		a[i]=a[j] ;
		a[j] = temp;
	}
	
	/**
	 * 
	 * @param a Ҫ��ӡ������
	 * @param count �ڼ���
	 */
	public void printArray(int[] a ,int count){
		System.out.print("��"+count+"�Σ�");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
