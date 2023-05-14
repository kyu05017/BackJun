package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 86단게
 * @Ttitle :공백으로 구분하기 1
 */

public class Step086 {
	public static void main(String[] args) {
		System.out.println(
				(
						(Arrays.toString(solution("programmers")))
				)
		);
	}
	public static String[] solution(String my_string) {

		List<String> list = Arrays.stream(my_string.split(" ")).collect(Collectors.toList());
		String[] answer  = new String[list.size()];
		list.toArray(answer);

		return answer;
	}
}


