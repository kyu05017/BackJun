package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 207단게
 * @Ttitle : 아이스 아메리카노
 */

public class Step207 {
	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(solution(5500))
		);
	}

	public static int[] solution(int money) {
		int[] answer = new int[2];
		answer[0]=money/5500;
		answer[1]=money%5500;
		return answer;
	}
} 