package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 197단게
 * @Ttitle : 짝수의 합
 */

public class Step197 {
	public static void main(String[] args) {

		System.out.println(
				(solution(10))
		);
	}

	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0){
				answer +=i;
			}
		}
		return answer;
	}
} 