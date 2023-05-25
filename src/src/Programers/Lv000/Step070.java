package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 70단게
 * @Ttitle :n보다 커질 때까지 더하기
 */

public class Step070 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution(new int[]{34, 5, 71, 29, 100, 34},123))
				)
		);
	}
	public static int solution(int[] numbers, int n) {
		int task = 0;
		for(int i = 0; i < numbers.length; i++) {
			task += numbers[i];

			if(task > n) {
				break;
			}
		}
		return task;
	}
}

