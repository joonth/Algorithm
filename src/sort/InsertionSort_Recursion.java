package sort;

public class InsertionSort_Recursion {
	
	private static void insertionSort(int[] arr, int num) {
		int tmp = 0;
		if(num <arr.length) {
			for (int i = num; i > 0; i--) {
				if(arr[i] < arr[i-1]) {
					tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
				}
			}
			num++;
			insertionSort(arr, num);
		}
	}
	
	private static void printSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {5,3,8,1,9};
		printSort(arr);
		insertionSort(arr, 1);
		printSort(arr);
	}
}
