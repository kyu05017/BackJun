package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 14단게
 * @Ttitle :두 정수 사이의 합
 */


public class Setp014 {
	public static void main(String[] args) {
		System.out.println((solution(3,5)));
	}

	public static long solution(int a, int b) {
		long answer = 0;
		long max=Math.max(a,b),min=Math.min(a,b);
		for(long i=min;i<=max;i++){
			answer+=i;
		}
		return answer;
	}
}
