package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 157단게
 * @Ttitle : 이진수 더하기
 */

public class Step157 {
	public static void main(String[] args) {

		System.out.println(
				(solution("10","11"	))
		);
	}
	public static String solution(String a, String b) {
		return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
	}
}


