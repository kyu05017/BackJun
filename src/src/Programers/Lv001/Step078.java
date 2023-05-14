package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 78단게
 * @Ttitle :대문자로 바꾸기
 */

public class Step078 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution("aBcDeFg"))
				)
		);
	}
	public static String solution(String myString) {
		return myString.toUpperCase();
	}
}

