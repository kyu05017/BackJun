package Programers.Lv000;


/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 51단게
 * @Ttitle : 세로 읽기
 *
 */

public class Step051 {

	public static void main(String[] args) {
		System.out.println(solution("ihrhbakrfpndopljhygc",4,2));
	}
	public static String solution(String my_string, int m, int c) {
		char[] arr = my_string.toCharArray();
		String answer = "";
		for(int i = c; i <= arr.length; i = i+m) {
			answer += String.valueOf(arr[i-1]);
		}
		return answer;
	}
}

