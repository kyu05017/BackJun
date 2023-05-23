package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 200단게
 * @Ttitle : 특정 문자 제거하기
 */

public class Step200 {
	public static void main(String[] args) {

		System.out.println(
				(solution("abcdef","f"))
		);
	}

	public static String solution(String my_string, String letter) {
		String answer = my_string.replace(letter,"");
		return answer;
	}
} 