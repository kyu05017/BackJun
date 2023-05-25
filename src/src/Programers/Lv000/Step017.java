package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 17단게
 * @Ttitle : 공배수
 */

public class Step017 {
	public static void main(String[] args) {

		solution(91,2,26);
	}

	public static int solution(int number, int n, int m) {
		int answer = 0;

		if(number%n == 0 && number%m == 0) {
			answer = 1;
		}

		return answer;
	}
}

