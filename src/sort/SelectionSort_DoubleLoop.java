package sort;

public class SelectionSort_DoubleLoop {
	
	private static void SelectionSort(int[] arr) {
		int min =0;
		int tmp = 0;
		
		for(int i =0; i<arr.length; i++) {
			min = arr[i];
			for(int j=i; j<arr.length; j++) {
				if(min >arr[j]) {
					min = arr[j];
					tmp = j;
				}				
				if(j==arr.length-1) {
					if(min != arr[i]) {
						arr[tmp] = arr[i];
						arr[i] = min;
					}
				}
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
		int[] arr = {4,3,8,2,1};
		
		printSort(arr);
		SelectionSort(arr);
		printSort(arr);
	}
}
