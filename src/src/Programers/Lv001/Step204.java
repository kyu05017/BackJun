package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 204단게
 * @Ttitle : 직각삼각형 출력하기
 */

public class Step204 {
	public static void main(String[] args) {
		System.out.println(
				solution("jaron")
		);
	}

	public static String solution(String my_string) {
		String answer = "";
		char[] temp = my_string.toCharArray();
		for(int i = my_string.length()-1; i >= 0; i--){
			answer += temp[i];
		}
		return answer;
	}
} 