package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 28단게
 * @Ttitle :부족한 금액 계산하기
 */

public class Setp028 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(3,20,4)
				)
		);
	}

	public static long solution(int p, int m, int c) {
		long temp = 0,sum = 0;
		for(int i=0;i<c;i++){
			temp = temp+p;
			sum += temp;
		}
		return (sum < m) ? 0 :sum-m;
	}
}
