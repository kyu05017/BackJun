package AlgorithmPractice.선형검색과보초법;

import java.util.Arrays;

public class 정렬연습해보기 {
	/**
	 * @Author: kyu05017
	 * @Date: 2023/05/07
	 * @Description: 정렬 연습
	 * @Ttitle : 오름차순 내림차순
	 */
	public static void main(String[] args) {

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

		// 오름차순
		int[] newArr = new int[arr.length];
		newArr[0] = min;
		newArr[arr.length-1] = max;
		int index = 1;

		for(int i = min+1; i < max; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == max || arr[j] == min){
					continue;
				}
				if(i == arr[j]) {
					newArr[index] = i;
					index++;
				}
			}
		}
		System.out.println("오름차순");
		for(int temp : newArr) {
			System.out.print("["+temp + "] ");
		}
		System.out.println("");
		// 내리차순
		int[] newArr2 = new int[arr.length];
		newArr2[0] = max;
		newArr2[arr.length-1] = min;
		int index2 = 1;
		for(int i = max-1; i > min; i--) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == max || arr[j] == min){
					continue;
				}
				if(i == arr[j]) {
					newArr2[index2] = i;
					index2++;
				}
			}
		}
		System.out.println("내림차순");
		for(int temp : newArr2) {
			System.out.print("["+temp + "] ");
		}
	}
}
