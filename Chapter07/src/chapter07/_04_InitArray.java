package chapter07;

public class _04_InitArray {

	public static void main(String[] args) {
		//int[] arr = new int[5];  // 0 0 0 0 0
		//int[] arr = new int[5] {1,2,3,4,5}; 오류
		
//		int[] arr = new int[] {1,2,3,4,5};  // 1
		int[] arr;
		arr = new int[] {1,2,3,4,5};
		
		int[] arr1 = {10, 20, 30, 40, 50};
//		int[] arr2;
//		arr2 =  {10, 20, 30, 40, 50};  // 오류
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
