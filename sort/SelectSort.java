package sort;

public class SelectSort extends BaseSort{
	
	public static void main(String[] args) {
		
		SelectSort Sort = new SelectSort();
		int[] a = {9,10,65,2,7,36,96,51};
//		int[] a = {9,2,7};
		Sort.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	
	}
	public  void sort(int[] a){
		int n =a.length;
		for (int i = a.length-1; i >0 ; i--) {//外层循环n-1次
			int sub = 0 ;//下标
			int j ;
			for ( j = 0; j <i; j++) {//循环n-1次
				if (a[sub]>a[j+1]) {
					
				}else {
					sub=j+1;
				}
			}
			swap(a, sub, j);//此时a[sub]最大，与内层循环末尾的a[j]交换
			printArray(a,n-i);
			
		}
		
		
	}//end sort()
	
	
}
