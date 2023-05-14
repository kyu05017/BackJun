package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 85단게
 * @Ttitle :ad 제거하기
 */

public class Step085 {
	public static void main(String[] args) {
		System.out.println(
				(
						(Arrays.toString(solution(new String[]{"and", "notad", "abcd"})))
				)
		);
	}
	public static String[] solution(String[] strArr) {
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].contains("ad")){
				continue;
			} else {
				list.add(strArr[i]);
			}
		}
		String[] answer = new String[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}/*
		List<String> list = Arrays.stream(strArr).filter(m -> !m.contains("ad")).collect(Collectors.toList());
		String[] answer  = new String[list.size()];
		list.toArray(answer); */
		return answer;
	}
}


