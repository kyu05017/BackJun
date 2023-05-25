package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/21
 * @Description: 프로그래머스 Lv01 180단게
 * @Ttitle : 팩토리얼
 */

public class Step180 {
	public static void main(String[] args) {

		System.out.println(
				(solution(120))
		);
	}

	public static int solution(int n) {
		int answer = 1;
		for(int i = 0; i <= n;) {
			answer = (i+1) * answer;
			if(answer > n){
				answer = i;
				break;
			}
			i++;
		}
		return answer;
	}
} 