package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 215단게
 * @Ttitle : 중앙값 구하기
 */

public class Step215 {
	public static void main(String[] args) {
		System.out.println(
				(solution(new int[]{1, 2, 7, 10, 11}))
		);
	}

	public static int solution(int[] a) {
		int answer = a.length/2;
		Arrays.sort(a);
		return a[answer];
	}
} 