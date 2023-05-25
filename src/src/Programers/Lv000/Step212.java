package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 212단게
 * @Ttitle : 피자 나눠 먹기 1
 */

public class Step212 {
	public static void main(String[] args) {
		System.out.println(
				(solution(10))
		);
	}

	public static int solution(int n) {
		int answer = 7;
		int i = 1;
		if(n <= 7){
			return 1;
		}
		if(n%7==0){
			return n/7;
		}
		while(answer <= n){
			i++;
			answer +=7;
		}
		return i;
	}
} 