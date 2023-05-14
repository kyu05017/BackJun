package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 82단게
 * @Ttitle :특정한 문자를 대문자로 바꾸기
 */

public class Step082 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution("programmers","p"))
				)
		);
	}
	public static String solution(String my_string, String alp) {
		if(!my_string.contains(alp)){
			return my_string;
		}
		char[] arr = my_string.toCharArray();

		String answer = "";
		for(int i = 0; i < arr.length; i++) {
			if(String.valueOf(arr[i]).equals(alp)) {
				arr[i] = alp.toUpperCase().toCharArray()[0];
			}
			answer += String.valueOf(arr[i]);
		}

		return answer;
	}
}

