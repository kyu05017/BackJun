package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 79단게
 * @Ttitle :소문자로 바꾸기
 */

public class Step079 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution("aBcDeFg"))
				)
		);
	}
	public static String solution(String myString) {
		return myString.toLowerCase();
	}
}

