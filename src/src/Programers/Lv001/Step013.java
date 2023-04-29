package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 13단게
 * @Ttitle : 문자열곱하기
 */

public class Step013 {
	public static void main(String[] args) {

		solution("string" ,3);
	}

	public static String solution(String my_string, int k) {
		String answer = "";

		for(int i =0 ; i < k; i++){
			answer += my_string;
		}
		return answer;
	}
}

