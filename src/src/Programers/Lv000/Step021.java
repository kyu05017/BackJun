package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 21단게
 * @Ttitle : 코드 처리하기
 */

public class Step021 {
	public static void main(String[] args) {

		System.out.println(solution("abc1abc1abc"));
	}

	public static String solution(String str) {
		String answer = "";
		int mode = 0;
		char[] arr = str.toCharArray();

		for(int i = 0; i < arr.length; i++) {
			if(mode == 0) {
				if(arr[i] != '1' && i%2 == 0) {
					answer += arr[i];
				} else if(arr[i] == '1') {
					mode =1;
				}
			} else {
				if(arr[i] != '1' && i%2 != 0) {
					answer += arr[i];
				} else if(arr[i] == '1') {
					mode =0;
				}
			}
		}

		answer = answer.equals("") ? "EMPTY" : answer;

		return answer;
	}
}

