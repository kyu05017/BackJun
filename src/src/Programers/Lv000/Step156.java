package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 156단게
 * @Ttitle : A로 B 만들기
 */

public class Step156 {
	public static void main(String[] args) {

		System.out.println(
				(solution("olleh","hello"	))
		);
	}
	public static int solution(String a, String b) {
		int answer = 1;
		char[] a2= a.toCharArray(),b2=b.toCharArray();
		Arrays.sort(a2);
		Arrays.sort(b2);
		for(int i=0;i<a2.length;i++){
			if(a2[i]!=b2[i]){
				return 0;
			}
		}
		return answer;
	}
}


