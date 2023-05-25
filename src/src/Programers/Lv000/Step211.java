package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 211단게
 * @Ttitle : 피자 나눠 먹기 (2)
 */

public class Step211 {
	public static void main(String[] args) {
		System.out.println(
				(solution(10))
		);
	}

	public static int solution(int n) {
		int gcd = maker(6,n);
		int ap = (n*6)/gcd;

		return ap/6;
	}
	public static int maker(int a, int b){
		if(a%b==0){
			return b;
		}
		return maker(b,a%b);
	}
} 