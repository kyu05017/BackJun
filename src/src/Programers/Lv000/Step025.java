package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 25단게
 * @Ttitle : 원소들의 곱과 합
 */

public class Step025 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{5, 7, 8, 3}));
	}

	public static int solution(int[] num_list) {
		int answer = 0;
		int sumMax = 0;
		int multi = 1;

		for(int i = 0; i < num_list.length; i++) {
			sumMax += num_list[i];
			multi *= num_list[i];
		}
		sumMax = sumMax*sumMax;
		if(multi < sumMax) {
			answer = 1;
		}
		return answer;
	}
}

