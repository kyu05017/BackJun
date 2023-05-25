package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 90단게
 * @Ttitle :간단한 식 계산하기
 */

public class Step090 {
	public static void main(String[] args) {
		System.out.println(
				(
						((solution("43 + 12")))
				)
		);
	}
	public static int solution(String binomial) {
		int answer = 0;
		String[] task = binomial.split(" ");
		int a = Integer.parseInt(task[0]);
		int b = Integer.parseInt(task[2]);
		if(binomial.contains("+")) {
			answer = a+b;
		} else if (binomial.contains("-")) {
			answer = a-b;
		} else {
			answer = a*b;
		}

		return answer;
	}
}


