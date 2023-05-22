package Programers.Lv001;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 194단게
 * @Ttitle : 진료 순서 정하기
 */

public class Step194 {
	static final String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {

		System.out.println(
				(solution(23))
		);
	}

	public static String solution(int age) {
		char[] temp = String.valueOf(age).toCharArray();
		String answer = "";
		for(char t : temp){
			answer += alpha[t-'0'];
		}

		return answer;
	}
} 