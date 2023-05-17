package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 140단게
 * @Ttitle : 숫자 찾기
 */

import java.util.ArrayList;
import java.util.List;

public class Step140 {
	public static void main(String[] args) {

		System.out.println(
				(solution(3, 1))
		);
	}
	public static int solution(int num, int k) {
		int answer = 0;
		char[] tmp = String.valueOf(num).toCharArray();
		for(char a : tmp ){
			answer++;
			if((a-'0')==k){
				return answer;
			}
		}
		answer = -1;
		return answer;
	}
}


