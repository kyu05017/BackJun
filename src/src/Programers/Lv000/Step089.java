package Programers.Lv000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 89단게
 * @Ttitle :문자열 잘라서 정렬하기
 */

public class Step089 {
	public static void main(String[] args) {
		System.out.println(
				(
						(Arrays.toString(solution("axbxxcxdx")))
				)
		);
	}
	public static String[] solution(String myString) {
		String[] answer = myString.split("x");
		Arrays.sort(answer);

		List<String> answerList = new ArrayList<>();
		for(int i = 0; i < answer.length; i++) {
			if(!answer[i].equals("") ) {
				answerList.add(answer[i]);
			}
		}
		String[]result = new String[answerList.size()];
		for(int i = 0; i < result.length; i++){
			result[i] = answerList.get(i);
		}
		Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
		return result;
	}
}


