package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 202단게
 * @Ttitle : 짝수 홀수 개수
 */

public class Step202 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}))
		);
	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for(int i = 0; i < num_list.length; i++){
			if(num_list[i]%2==0){
				answer[0] += 1;
			} else {
				answer[1] += 1;
			}
		}
		return answer;
	}
} 