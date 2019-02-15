package sort;

/*
 	인접한 두개의 자리를 비교해 차순에 맞게 교환하여 정렬하는 방법
	시간복잡도 O(n2)

*/
public class BubbleSort_DoubleLoop {
	
	private static void bubbleSort(int[] arr) {
		int num = arr.length-1;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j = 0; j<num; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j);
				}
			}
			num--;
		}
		printSort(arr);
	}
	
	private static void swap(int[] arr, int index) {
		int tmp =0;
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
		int[] arr = {10,22,1,6,2};
		printSort(arr);
		bubbleSort(arr);
		
	}
}
