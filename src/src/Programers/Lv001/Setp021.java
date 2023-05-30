package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 21단게
 * @Ttitle :없는 숫자 더하기
 */

public class Setp021 {
	public static void main(String[] args) {
		System.out.println((solution(new int[]{1,2,3,4,6,7,8,0})));
	}

	public static int solution(int[] s) {
		int answer = 0;
		for(int i=0;i<s.length;i++){
			answer += s[i];
		}
		return 45-answer;
	}
}
