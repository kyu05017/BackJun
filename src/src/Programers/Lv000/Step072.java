package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 72단게
 * @Ttitle :조건에 맞게 수열 변환하기 1
 */

public class Step072 {
	public static void main(String[] args) {
		System.out.println(
				(
						Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}))
				)
		);
	}
	public static int[] solution(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 50 && arr[i]%2==0){
				arr[i] = arr[i]/2;
			} else if(arr[i] < 50 && arr[i]%2!=0){
				arr[i] = arr[i]*2;
			}
		}
		return arr;
	}
}

