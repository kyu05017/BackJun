package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 69단게
 * @Ttitle :5명씩
 */

public class Step069 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},new boolean[]{true, false, true, false})
				)
		);
	}
	public static String[] solution(String[] todo_list, boolean[] finished) {
		List<String> list = new ArrayList<String>();


		for(int i = 0 ; i < todo_list.length ; i++) {
			if(!finished[i]) {
				list.add(todo_list[i]);
			}
		}
		String[] answer = new String[list.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = list.get(i);
		}
		return answer;
	}
}

