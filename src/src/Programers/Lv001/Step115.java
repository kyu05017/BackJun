package Programers.Lv001;

import java.util.stream.IntStream;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 114단게
 * @Ttitle :주사위 게임 1
 */

public class Step115 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}))
		);
	}
	public static int solution(int[] date1, int[] date2) {
		int a = IntStream.of(date1).sum();
		int b = IntStream.of(date2).sum();
		return a < b ? 1 : 0;
	}
}


