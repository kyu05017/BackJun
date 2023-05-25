package Programers.Lv000;

import java.util.Date;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 115단게
 * @Ttitle :주사위 게임 1
 */

public class Step115 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{2021, 12, 31}, new int[]{2022, 1, 1}))
		);
	}
	public static int solution(int[] date1, int[] date2) {
		Date a = new Date(date1[0],date1[1],date1[2]);
		Date b = new Date(date2[0],date2[1],date2[2]);
		int result = a.compareTo(b);
		return result < 0 ? 1:0;
	}
}


