package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 192단게
 * @Ttitle : 순서쌍의 개수
 */

public class Step192 {
	public static void main(String[] args) {

		System.out.println(
				(solution(20))
		);
	}

	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i==0){
				answer++;
			}
		}
		return 0;
	}
} 