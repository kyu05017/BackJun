package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 49단게
 * @Ttitle : 접두사인지 확인하기
 *
 */

public class Step049 {

	public static void main(String[] args) {
		System.out.println(solution("banana","ban"));
	}
	public static int solution(String my_string, String is_prefix) {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < my_string.length(); i++) {
			list.add(my_string.substring(0,i+1));
		}

		int answer = 0;
		for(String temp : list) {
			if(temp.equals(is_prefix)) {
				answer = 1;
			}
		}

		return answer;
	}
}

