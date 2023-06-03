package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/06/01
 * @Description: 프로그래머스 Lv1 36단게
 * @Ttitle : 예산
 */

public class Setp036 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(new int[]{1,3,2,5,4}, 9)
				)
		);
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		Arrays.sort(d);
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
			if(sum > budget){
				answer = i;
				break;
			}

		}
		if(sum <= budget){
			answer = d.length;
		}
		return answer;
	}
}
