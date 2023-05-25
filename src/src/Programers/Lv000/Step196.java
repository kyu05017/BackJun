package Programers.Lv000;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 196단게
 * @Ttitle : 배열 자르기
 */

public class Step196 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 2, 3, 4, 5},1,3))
		);
	}

	public static int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = {};
		List<Integer> temp = new ArrayList<>();
		for(int i = num1; i <= num2; i++){
			temp.add(numbers[i]);
		}
		answer = new int[temp.size()];
		for(int i=0;i< answer.length;i++){
			answer[i] = temp.get(i);
		}
		return answer;
	}
} 