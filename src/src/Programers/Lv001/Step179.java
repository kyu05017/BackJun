package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/20
 * @Description: 프로그래머스 Lv01 179단게
 * @Ttitle : 모음제거
 */

public class Step179 {
	public static void main(String[] args) {

		System.out.println(
				(solution("nice to meet you"	))
		);
	}

	public static String solution(String a) {
		String answer = "";
		System.out.println(a.replaceAll("[aeiou]" , ""));
		System.out.println(maker(a));
		return answer;
	}
	private static String maker(String a) {
		String re = "";
		String[] tesk = {"a","e","i","o","u"};
		for(int i = 0; i < tesk.length; i++) {
			if(a.indexOf(tesk[i]) != -1){
				re =  a.replace(tesk[i],"");
				a = re;
			}
		}
		return  re;
	}
}