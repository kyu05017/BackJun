package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 84단게
 * @Ttitle :문자열이 몇 번 등장하는지 세기
 */

public class Step084 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution("banana","ana"))
				)
		);
	}
	public static int solution(String myString, String pat) {

		int task = 0;
		for(int i=0; i<myString.length(); i++) {
			if(myString.substring(i).startsWith(pat)){
				task++;
			}
		}
		return task;
	}
}


