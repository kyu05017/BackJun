package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 114단게
 * @Ttitle :주사위 게임 1
 */

public class Step114 {
	public static void main(String[] args) {

		System.out.println(
				(solution(2,4))
		);
	}
	public static int solution(int a, int b) {
		int answer = 0;
		if(a%2==0 && b%2==0){
			answer = a-b;
		} else if(a%2!=0 && b%2!=0){
			answer = (a*a)+(b*b);
		} else {
			answer = 2*(a+b);
		}
		if(answer < 0) {
			answer = answer*-1;
		}
		return answer;
	}
}


