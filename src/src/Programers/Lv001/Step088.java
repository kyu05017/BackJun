package Programers.Lv001;

import java.util.*;
/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 88단게
 * @Ttitle :x 사이의 개수
 */

public class Step088 {
	public static void main(String[] args) {
		System.out.println(
				(
						(Arrays.toString(solution("oxooxoxxox")))
				)
		);
	}
	public static int[] solution(String myString) {
		List<Integer> list = new ArrayList<>();
		String[] task =myString.split("x",-1);
		for(int i = 0; i < task.length; i++) {
			list.add(task[i].length());
		}
		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}


