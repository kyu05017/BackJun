package Programers.Lv001;

import java.util.*;
/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 205단게
 * @Ttitle : 배열 뒤집기
 */

public class Step205 {
	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}))
		);
	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];

		List<Integer> temp = new ArrayList<>();

		for(int i = num_list.length - 1; i >= 0; i--) {
			temp.add(num_list[i]);
		}
		for(int i = 0; i < answer.length; i++){
			answer[i] = temp.get(i);
		}
		return answer;
	}
} 