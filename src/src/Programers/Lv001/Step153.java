package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 153단게
 * @Ttitle : 삼각형의 완성조건 (1)
 */

public class Step153 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{3, 10, 28}))
		);
	}
	public static int solution(int[] s) {
		Arrays.sort(s);
		int m=s[s.length-1],o=0;
		for(int t:s){
			o+=t;
		}
		return m<(o-m)?1:2;
	}
}


