package Programers.Lv001;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 12단게
 * @Ttitle : 문자열 리스트로변환하기
 */

public class Step012 {
	public static void main(String[] args) {
		String[] str1 = {"a","b","c"};
		solution( str1);
	}

	public static String solution(String[] str1) {
		String answer = "";

		for(int i = 0; i < str1.length; i++) {
            answer += str1[i];
        }
		return answer;
	}
}

