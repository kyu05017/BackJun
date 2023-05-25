package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 111단게
 * @Ttitle :부분 문자열
 */

public class Step111 {
	public static void main(String[] args) {

		System.out.println(
				(solution("banana","ana"))
		);
	}
	public static int solution(String str1, String str2) {
		return str2.contains(str1) ? 0 : 1;
	}
}


