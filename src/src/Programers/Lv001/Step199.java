package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 199단게
 * @Ttitle : 각도기
 */

public class Step199 {
	public static void main(String[] args) {

		System.out.println(
				(solution(180))
		);
	}

	public static int solution(int a) {
		int answer = 0;
		if( a == 180) {
			answer = 4;
		} else if( a < 90) {
			answer = 1;
		} else if( a == 90){
			answer = 2;
		} else {
			answer = 3;
		}
		return answer;
	}
} 