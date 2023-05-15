package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 110단게
 * @Ttitle :부분 문자열인지 확인하기
 */

public class Step110 {
	public static void main(String[] args) {

		System.out.println(
				(solution("banana","ana"))
		);
	}
	public static int solution(String my_string, String target) {
		return my_string.contains(target) ? 1 : 0;
	}
}


