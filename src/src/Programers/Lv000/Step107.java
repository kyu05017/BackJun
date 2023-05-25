package Programers.Lv000;

import java.math.BigInteger;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 107단게
 * @Ttitle :문자열을 정수로 변환하기
 */

public class Step107 {
	public static void main(String[] args) {

		System.out.println(
				solution("582","734")
		);
	}
	public static String solution(String a, String b) {
		BigInteger bigA = new BigInteger(a);
		BigInteger bigB = new BigInteger(b);
		return String.valueOf(bigA.add(bigB));
	}
}


