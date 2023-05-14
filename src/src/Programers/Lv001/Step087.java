package Programers.Lv001;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 87단게
 * @Ttitle :공백으로 구분하기 2
 */

public class Step087 {
	public static void main(String[] args) {
		System.out.println(
				(
						(Arrays.toString(solution(" i    love  you")))
				)
		);
	}
	public static String[] solution(String my_string) {
		String[] answer  = {};

		my_string = my_string.trim();

		my_string = my_string.replaceAll("\\s+", " ");

		answer  = my_string.split(" ");
		return answer;
	}
}


