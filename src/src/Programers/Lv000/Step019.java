package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 프로그래머스 Lv01 19단게
 * @Ttitle : 조건문자열
 */

public class Step019 {
	public static void main(String[] args) {
		solution(">","!",41,78);
	}

	public static int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		int flag = 0;

		if (n == m) {
			flag = 0;
		}else if(n < m) {
			flag = 1;
		} else {
			flag = 2;
		}

		if(flag == 0) {
			if(eq.equals("=")) {
				answer = 1;
			}
		} else if(flag == 1) {
			if(ineq.equals("<")) {
				answer = 1;
			}
		} else {
			if(ineq.equals(">")) {
				answer = 1;
			}
		}
		return answer;
	}
}

