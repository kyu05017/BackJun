package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/21
 * @Description: 프로그래머스 Lv01 181단게
 * @Ttitle : 최댓값 만들기 (1)
 */

public class Step181 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 2, 3, 4, 5}))
		);
	}

	public static int solution(int[] n) {
		Arrays.sort(n);

		return n[n.length - 1] * n[n.length -2];
	}
} 