package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/20
 * @Description: 프로그래머스 Lv01 178단게
 * @Ttitle : 문자열 정렬하기 (1)
 */

public class Step178 {
	public static void main(String[] args) {

		System.out.println(
				(solution("hi12392"))
		);
	}

	public static int[] solution(String a) {
		String result2 = a.replaceAll("[^0-9]","");
		char[] result = result2.toCharArray();
		Arrays.sort(result);
		int[] answer = new int[result.length];
		int i = 0;
		for(char temp : result) {
			answer[i] = temp-'0';
			i++;
		}
		return answer;
	}
}