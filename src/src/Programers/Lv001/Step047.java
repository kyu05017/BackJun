package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 47단게
 * @Ttitle : 접미사인지 확인하기
 *
 */

public class Step047 {

	public static void main(String[] args) {
		System.out.println(solution("banana","ana"));
	}
	public static int solution(String my_string, String is_suffix) {

		List<String> list = new ArrayList<String>();
		for(int i = my_string.length() -1; i >= 0; i--){
			list.add(my_string.substring(i,my_string.length()));
		}
		int answer = 0;
		for(String temp : list) {
			if(temp.equals(is_suffix)){
				answer = 1;
			}
		}


		return answer;
	}
}

