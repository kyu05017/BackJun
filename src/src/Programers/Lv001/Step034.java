package Programers.Lv001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/07
 * @Description: 프로그래머스 Lv01 34단게
 * @Ttitle : 카운트 업
 */

public class Step034 {

	public static void main(String[] args) {
		solution(3,10);
	}
	public static int[] solution(int start, int end) {
		int[] answer = {};
		int length = 0 ;
		for(int i = start; i <= end; i++) {
			length++;
		}
		answer = new int[length];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = start;
			start++;
		}

		return answer;
	}
}

