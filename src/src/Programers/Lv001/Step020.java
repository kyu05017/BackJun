package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 프로그래머스 Lv01 20단게
 * @Ttitle : flag 에 따른 다른값 변환하기
 */

public class Step020 {
	public static void main(String[] args) {
		solution( 2,  5,  true);
	}

	public static int solution(int a, int b , boolean flag) {
		int answer = 0;
		if(flag) {
			answer = a+b;
		} else {
			answer = a-b;
		}
		return answer;
	}
}

