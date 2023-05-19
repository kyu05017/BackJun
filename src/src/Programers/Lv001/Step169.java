package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 169단게
 * @Ttitle : 숨어있는 숫자의 덧셈 (2)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step169 {
	public static void main(String[] args) {

		System.out.println(
				(solution("aAb1B2cC34oOp"))
		);
	}

	public static int solution(String m) {
		int answer = 0;
		List<String> list = maker(m);
		for(String s : list){
			answer += Integer.parseInt(s);
		}
		return answer;
	}

	public static List<String> maker(String a) {
		String result2 = a.replaceAll("[^0-9]","_");
		String[] t = result2.split("_");

		List<String> list = new ArrayList<String>();
		for(int i = 0; i < t.length; i++) {
			if(!t[i].isEmpty()){
				list.add(t[i]);
			}
		}
		return list;
	}
}