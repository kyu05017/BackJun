package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 127단게
 * @Ttitle : 연속된 수의 합
 */

public class Step127 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(3, 12))
		);
	}
	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		int task = total/num-(num-1)/2;
		for(int i=0;i<answer.length;i++){
			answer[i]=task+i;
		}
		return answer;
	}
}


