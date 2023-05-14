package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 83단게
 * @Ttitle :특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 */

public class Step083 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution("AAAAaaaa","a"))
				)
		);
	}
	public static String solution(String myString, String pat) {
		return myString.substring(0,myString.lastIndexOf(pat))+pat;
	}
}


