package Programers.Lv000;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 93단게
 * @Ttitle :세 개의 구분자
 */

public class Step093 {
	public static void main(String[] args) {
		System.out.println(
				(
						(Arrays.toString(solution("baconlettucetomato")))
				)
		);
	}
	public static String[] solution(String myStr) {
		String[] answer = {};
		myStr = myStr.replace("a"," ");
		myStr = myStr.replace("b"," ");
		myStr = myStr.replace("c"," ");
		myStr = myStr.replaceAll("\\s+", " ");
		String[] task = myStr.split(" ");
		if(task.length == 0) {
			answer = new String[]{"EMPTY"};
		} else {
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < task.length; i++) {
				if(!task[i].isEmpty()) {
					list.add(task[i]);
				}
			}
			answer = list.toArray(String[]::new);
		}

		return answer;
	}
}


