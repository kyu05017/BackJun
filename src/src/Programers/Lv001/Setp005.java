package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 5단게
 * @Ttitle : 자릿수 더하기
 */


public class Setp005 {
	public static void main(String[] args) {
		System.out.println(solution(123));
	}

	public static int solution(int n) {
		int answer = 0;

		char[] tmp = String.valueOf(n).toCharArray();
		for(char t : tmp){
			answer += (t-'0');
		}
		return answer;
	}
}
