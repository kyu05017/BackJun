package Programers.Lv000;

import java.util.stream.IntStream;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 80단게
 * @Ttitle :배열에서 문자열 대소문자 변환하기
 */

public class Step080 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution(new String[]{"AAA","BBB","CCC","DDD"}))
				)
		);
	}
	public static String[] solution(String[] strArr) {
		for( int i = 0; i < strArr.length; i++) {
			if( i %2 == 0 ) {
				strArr[i] = strArr[i].toLowerCase();
			} else {
				strArr[i] = strArr[i].toUpperCase();
			}
		}
		IntStream.range(0, strArr.length).mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
		return strArr;
	}
}

