package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 27단게
 * @Ttitle :문자열 내림차순으로 배치하기
 */

public class Setp027 {
	public static void main(String[] args) {
		System.out.println((solution("Zbcdefg")));
	}

	public static String solution(String s) {
		String answer = "";
		char[] tmp = s.toCharArray();
		Arrays.sort(tmp);
		for(int i=tmp.length-1;i>=0;i--){
			answer += tmp[i];
		}
		return answer;
	}
}
