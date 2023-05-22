package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 190단게
 * @Ttitle : 모스부호 (1)
 */

public class Step190 {

	static final String[] moth = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
	static final String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	public static void main(String[] args) {

		System.out.println(
				(solution(".... . .-.. .-.. ---"))
		);
	}

	public static String solution(String letter) {
		String answer = "";
		String[] lets = letter.split(" ");
		for(int i = 0; i < lets.length; i++) {
			for (int j = 0; j < moth.length; j++) {
				if (lets[i].equals(moth[j])) {
					answer += alpha[j];
				}
			}
		}
		return answer;
	}
} 