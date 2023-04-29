package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 16단게
 * @Ttitle : N의 배수
 */

public class Step016 {
	public static void main(String[] args) {

		solution(91,2);
	}

	public static int solution(int num, int n) {
		int answer = 0;

		if(num%n != 0) {
			answer = 0;
		}

		return answer;
	}
}

