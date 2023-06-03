package Programers.Lv001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/06/03
 * @Description: 프로그래머스 Lv1 40단계
 * @Ttitle : 크기가 작은 부분문자열
 */

public class Setp040 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution("3141592","271")
				)
		);
	}

	public static int solution(String t, String p) {
		int answer = 0;
		List<Long> list = new ArrayList<Long>();
		char[] temp = t.toCharArray();
		for(int i = 0; i < t.length()-(p.length()-1); i++) {
			String tesk = "";
			for(int j = 0; j < p.length(); j++) {
				tesk += String.valueOf(temp[i+j]-'0');
			}
			list.add(Long.parseLong(tesk));
		}

		for(Long i : list) {
			if(Long.parseLong(p) >= i){
				answer++;
			}
		}
		return answer;
	}
}
