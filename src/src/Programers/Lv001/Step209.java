package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 209단게
 * @Ttitle : 배열의 평균값
 */

public class Step209 {
	public static void main(String[] args) {
		System.out.println(
				(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))
		);
	}

	public static double solution(int[] numbers) {
		double answer = 0;
		for(int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		return answer/numbers.length;
	}
} 