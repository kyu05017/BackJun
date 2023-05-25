package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 136단게
 * @Ttitle : 문자열안에 문자열
 */

public class Step136 {
	public static void main(String[] args) {

		System.out.println(
				(solution("ab6CDE443fgh22iJKlmn1o","6CD"))
		);
	}
	public static int solution(String str1, String str2) {
		return str1.contains(str2)?1:2;
	}
}


