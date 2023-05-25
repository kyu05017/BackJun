package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 135단게
 * @Ttitle : 제곱수 판별하기
 */

public class Step135 {
	public static void main(String[] args) {

		System.out.println(
				(solution(2,10))
		);
	}
	public static int solution(int n, int t) {
		int answer = n,af=0;
		for(int i=0;i<t;i++){
			af=answer*2;
			answer=af;
		}
		return answer;
	}
}


