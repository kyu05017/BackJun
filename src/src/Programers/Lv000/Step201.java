package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 201단게
 * @Ttitle : 문자 반복 출력하기
 */

public class Step201 {
	public static void main(String[] args) {

		System.out.println(
				(solution("hello",3))
		);
	}

	public static String solution(String my_string, int n) {
		String answer = "";
		char[] temp = my_string.toCharArray();
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < n; j++) {
				answer += temp[i];
			}
		}
		return answer;
	}
} 