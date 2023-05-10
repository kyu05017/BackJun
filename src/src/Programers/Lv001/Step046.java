package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 46단게
 * @Ttitle : 접미사 배열
 *
 */

public class Step046 {

	public static void main(String[] args) {
		System.out.println(solution("banana"));
	}
	public static String[] solution(String my_string) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = my_string.length()-1; i >=0; i--){
			list.add(my_string.substring(i,my_string.length()));
		}

		String[] answer = new String[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);

		return answer;
	}
}

