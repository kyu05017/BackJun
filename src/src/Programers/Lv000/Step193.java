package Programers.Lv000;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 193단게
 * @Ttitle : 진료 순서 정하기
 */

public class Step193 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(new int[]{3, 76, 24}))
		);
	}

	public static int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		Integer[] temp = new Integer[emergency.length];

		for(int i = 0; i < temp.length;i++){
			temp[i] = emergency[i];
		}
		Arrays.sort(temp, Collections.reverseOrder());

		for(int i = 0; i< answer.length;i++){
			for(int j = 0; j < temp.length;j++){
				if(emergency[i] == temp[j]){
					answer[i] = (j+1);
				}
			}
		}

		return answer;
	}
} 