package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/13
 * @Description: 프로그래머스 Lv01 65단게
 * @Ttitle : 왼쪽 오른쪽
 */


public class Step065 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"r", "r", "u", "u"})));
	}
	public static String[] solution(String[] str_list) {
		int chNum = -1;
		String ch = "";
		List<String> list = new ArrayList<>();
		String[] answer = {};
		for(int i = 0; i < str_list.length; i++){
			if(str_list[i].equals("l") || str_list[i].equals("r") ){
				chNum = i;
				ch = str_list[i];
				break;
			}
		}
		if(chNum != -1){
			if(ch.equals("l")) {
				for(int i = 0; i < chNum; i++) {
					list.add(str_list[i]);
				}
			}else if(ch.equals("r")) {
				for(int i = chNum; i < str_list.length; i++) {
					list.add(str_list[i]);
				}
			}

			if(list.size() != 0) {
				answer = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {
					answer[i] = list.get(i);
				}
			}
		} else {
			return answer;
		}
		return answer;
	}
}

