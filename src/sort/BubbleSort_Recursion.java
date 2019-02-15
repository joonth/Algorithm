package sort;

public class BubbleSort_Recursion {
	
	private static void bubbleSort(int[] arr, int last) {
		if(last !=0) {		
			for(int i=0; i<last; i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr,i);
				}
			}
			bubbleSort(arr,last-1);
		}
	}
	
	private static void swap(int[] arr, int index) {
		int tmp = 0;
		tmp = arr[index+1];
		arr[index+1] = arr[index];
		arr[index] = tmp;
	}
	
	
	private static void printSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {11,5,8,2,6};
		
		printSort(arr);
		bubbleSort(arr, arr.length-1);
		printSort(arr);
	}
}
