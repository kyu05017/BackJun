package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 150단게
 * @Ttitle : 암호해독
 */

public class Step150 {
	public static void main(String[] args) {

		System.out.println(
				(solution("dfjardstddetckdaccccdegk",4))
		);
	}
	public static String solution(String cipher, int code) {
		String answer = "";
		String[] temp = cipher.split("");
		if(code == 1) {
			answer = cipher;
		} else {
			for(int i = 1; i <= cipher.length(); i++) {
				if(i%code==0) {
					answer += temp[i - 1];
				}
			}
		}
		return answer;
	}
}


