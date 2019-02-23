package sort;

public class QuickSort {
	
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int begin, int end) {
		int part2 = partition(arr, begin, end);
		if(begin < part2 - 1) {
			quickSort(arr, begin, part2 -1);
		}
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	private static int partition(int[] arr, int begin, int end) {
		int pivot = arr[(begin+ end) / 2];
		while(begin <= end) {
			while(arr[begin] < pivot) begin++;
			while(arr[end] > pivot) end--;
			if( begin <= end) {
				swap(arr, begin, end);
				begin++;
				end--;
			}
		}
		return begin;
	}
	
	private static void swap(int[] arr, int begin, int end) {
		int tmp = arr[begin];
		arr[begin] = arr[end];
		arr[end] = tmp;
	}
	
	private static void printSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,6,4,2,9};
		printSort(arr);
		quickSort(arr);
		printSort(arr);
	}
}
