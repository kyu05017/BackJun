package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 81단게
 * @Ttitle :A 강조하기
 */

public class Step081 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution("abstract algebra"))
				)
		);
	}
	public static String solution(String myString) {
		String answer = "";
		char[] arr = myString.toLowerCase().toCharArray();

		for(int i = 0; i < arr.length; i++) {
			if(String.valueOf(arr[i]).equals("a")) {
				arr[i] = 'A';
			}
			answer += String.valueOf(arr[i]);
		}

		return answer;
	}
}

