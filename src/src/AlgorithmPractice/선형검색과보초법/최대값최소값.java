package AlgorithmPractice.선형검색과보초법;

public class 최대값최소값 {

	/**
	 * @Author: kyu05017
	 * @Date: 2023/05/07
	 * @Description: 최대값 최소값
	 * @Ttitle :
	 */

	public static void main (String[] args) {

		int[] arr = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
		int max = arr[0],min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			// 1 부터 시작하는 이유는 0(a[0] == 72)을 이미 할당해서 값은 값을 비교 할 필요 가 없다
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.printf(" 배열의 최대값 : %d 배열의 최소값 : %d" , max ,min);
	}
}
