package sort;

public class SelectionSort_Recursion {
	
	private static void SelectionSort(int[] arr, int num) {
		if(num != arr.length) {
			
			int min = arr[num];
			int tmp = 0;
			
			for (int i = num+1; i < arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
					tmp = i;
				}
				if(i == arr.length-1) {
					if(arr[num] != min) {
						arr[tmp] = arr[num];
						arr[num] = min;
					}
				}
			}
			num++;
			SelectionSort(arr,num);
		}
	}
	
	private static void printSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,8};
		
		printSort(arr);
		SelectionSort(arr, 0);
		printSort(arr);
		
	}
}
