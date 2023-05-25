package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 221단게
 * @Ttitle : 두 수의 나눗셈
 */

public class Step221 {
	public static void main(String[] args) {
		System.out.println(
				(solution(2,3))
		);
	}

	public static int solution(int a, int b) {
		double c=a,d=b;
		double tesk = (c/d)*1000;
		return (int)tesk;
	}
} 