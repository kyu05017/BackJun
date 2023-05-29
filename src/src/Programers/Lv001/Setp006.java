package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 5단게
 * @Ttitle : 자릿수 더하기
 */


public class Setp006 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2,5)));
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long temp = x;
		for(int i = 0; i < n; i++){
			answer[i] = (long)temp;
			temp += x;
		}

		return answer;
	}
}
