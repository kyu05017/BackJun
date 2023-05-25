package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 77단게
 * @Ttitle :원하는 문자열 찾기
 */

public class Step077 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution("aaAA","aaaaa"))
				)
		);
	}
	public static int solution(String myString, String pat) {
		return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
	}
}

