package sort;

public class MergeSort {
	
	private static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length-1);
	}
	
	
	private static void mergeSort(int[] arr,int[] tmp, int begin,int end) {
		if(begin <end) {
			int mid = (begin + end)/2;
			mergeSort(arr,tmp, begin, mid);
			mergeSort(arr,tmp, mid+1, end);			
			merge(arr, tmp, begin, mid, end);
		}
	}
	
	private static void merge(int[] arr, int[] tmp, int begin, int mid, int end) {
		for(int i=begin; i<= end; i++) {
			tmp[i] = arr[i];
		}
		
		int part1 = begin;
		int part2 = mid +1;
		int index = begin;
		
		while (part1<=mid && part2 <=end) {
			if(tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			}else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
			for(int i=0; i<= mid - part1; i++) {
				arr[index +i] = tmp[part1 +i];
			}
		}
	}
	
	
	private static void printSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,1,7,9,4};
		printSort(arr);
		mergeSort(arr);
		printSort(arr);		
	}
}
