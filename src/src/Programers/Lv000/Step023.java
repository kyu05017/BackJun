package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 23단게
 * @Ttitle : 주사위 놀이 2번
 */

public class Step023 {
	public static void main(String[] args) {
		System.out.println(solution(4,4,4));
	}

	public static int solution(int a, int b, int c) {
		int answer = 0;
		if(a==b&& a==c) {
			answer = (a+b+c)*((int)Math.pow(a,2)+(int)Math.pow(b,2)+(int)Math.pow(c,2))*((int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3));
		} else {
			if(a != b && b != c && a != c) {
				answer = a+b+c;
			} else {
				answer = (a+b+c)*((int)Math.pow(a,2)+(int)Math.pow(b,2)+(int)Math.pow(c,2));
			}
		}
		return answer;
	}
}

