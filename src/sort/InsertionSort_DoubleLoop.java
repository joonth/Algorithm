package sort;

public class InsertionSort_DoubleLoop {
	
	private static void InsertionSort(int[] arr) {
		int num = 0;
		int tmp = 0;
		for (int i = 1; i < arr.length; i++) {
			num = i;	
			while(0 < num) {
				if(arr[num] < arr[num-1]) {
					tmp = arr[num-1];
					arr[num-1] = arr[num];
					arr[num] = tmp;					
				}	
				num--;
			}
		}
	}
	
	private static void printSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,6,8,2,1};
		printSort(arr);
		InsertionSort(arr);
		printSort(arr);
	}
}
