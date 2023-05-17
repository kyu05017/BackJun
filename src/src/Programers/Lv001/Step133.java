package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 133단게
 * @Ttitle : 문자열 정렬하기 (2)
 */

public class Step133 {
	public static void main(String[] args) {

		System.out.println(
				(solution("Bcad"))
		);
	}
	public static String solution(String my_string) {
		my_string = my_string.toLowerCase();
		char[] task = my_string.toCharArray();
		Arrays.sort(task);
		String answer = "";
		for(char temp:task){
			answer+=temp;
		}
		return answer;
	}
}


