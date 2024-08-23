package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 배열의 유효한 요소 값 출력하기
		double[] num = new double[5];
		int size = 0;
		
		num[0] = 10.0;	size= size + 1;
		num[1] = 20.0;  size += 1;
		num[2] = 30.0;  ++size;
		
		for(int i=0; i<size; i++) {
			System.out.println(num[i]);  // num[0], num[1] .....num[4]
		}
		
	}

}
