package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 48단게
 * @Ttitle : 문자열의 앞의 n글자
 *
 */

public class Step048 {

	public static void main(String[] args) {
		System.out.println(solution("ProgrammerS123",11));
	}
	public static String solution(String my_string, int n) {
		return my_string.substring(0,n);
	}
}

