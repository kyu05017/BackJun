package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 149단게
 * @Ttitle : 대문자와 소문자
 */

public class Step149 {
	public static void main(String[] args) {

		System.out.println(
				(solution("cccCCC"))
		);
	}
	public static String solution(String my_string) {
		char[] task = my_string.toCharArray();
		String answer = "";
		for(int i = 0; i < task.length; i++){
			if( 'a' <= task[i] && task[i] <= 'z'){
				task[i] = Character.toUpperCase(task[i]);
			} else if( 'A' <= task[i] && task[i] <= 'Z'){
				task[i] = Character.toLowerCase(task[i]);
			}
			answer += task[i];
		}
		return answer;
	}
}


