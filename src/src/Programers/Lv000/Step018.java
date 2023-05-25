package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 18단게
 * @Ttitle : 홀짝에 따라 단른 값 반환하기
 */

public class Step018 {
	public static void main(String[] args) {


		System.out.println(solution(7));
	}

	public static int solution(int n) {
		int answer = 0;
		boolean flag = false;
		if (n % 2 == 0) { //짝수
			flag = true;
		}

		for(int i = 1; i <= n; i++) {
			if(flag) {
				if(i % 2 == 0) {
					answer += i*i;
				}
			} else {
				if(i % 2 != 0) {
					answer += i;
				}
			}
		}

		return answer;
	}
}

