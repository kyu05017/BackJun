package Programers.Lv001;


import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 53단게
 * @Ttitle : 문자 개수 세기
 *
 */

public class Step053 {

	public static void main(String[] args) {
		System.out.println(solution("Programmers"));
	}
	public static int[] solution(String my_string) {
		// A to Z == 65 to 90
		// a to z == 97 to 122
		int[] answer = new int [52];
		char[] arr = my_string.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			int j = 0;
			for(int k = 'A'; k <= 'Z'; k++) {
				if((char)k == arr[i]){
					answer[j] = answer[j] +1;
				}
				j++;
			}
			for(int k = 'a'; k <= 'z'; k++) {
				if((char)k == arr[i]){
					answer[j] = answer[j] +1;
				}
				j++;
			}
		}
		return answer;
	}
}

