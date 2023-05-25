package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 105단게
 * @Ttitle :문자열 정수의 합
 */

public class Step105 {
	public static void main(String[] args) {

		System.out.println(
				solution("123456789")
		);
	}
	public static int solution(String num_str) {
		int answer = 0;
		String[] task = num_str.split("");
		for(String temp : task) {
			answer += Integer.parseInt(temp);
		}
		return answer;
	}
}


