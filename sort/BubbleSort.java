package sort;

public class BubbleSort extends BaseSort{
	
	public static void main(String[] args) {
		
		BubbleSort bubbleSort = new BubbleSort();
//		int[] a = {9,10,65,2,7,36,96,51};
		int[] a = {9,8,7,6,5,4,3,2,1};
		bubbleSort.sort(a);
		
		
	}
	public  void sort(int[] a){
		int n =a.length;
		
		for (int i = n-1; i >0 ; i--) {
			for (int j = 0; j <i; j++) {
				if (a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
			printArray(a,n-i);
			
		}
		
		
	}//end sort()
	
	
}
