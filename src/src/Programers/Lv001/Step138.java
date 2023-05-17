package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 138단게
 * @Ttitle : 자릿수 더하기
 */

public class Step138 {
	public static void main(String[] args) {

		System.out.println(
				(solution(1234))
		);
	}
	public static int solution(int n) {
		int answer = 0;
		char[] aa = String.valueOf(n).toCharArray();
		for(char tmp : aa){
			answer += (tmp-'0');
		}
		return answer;
	}
}


