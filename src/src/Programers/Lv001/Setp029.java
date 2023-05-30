package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 29단게
 * @Ttitle :문자열 다루기 기본
 */

public class Setp029 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution("1234")
				)
		);
	}

	public static boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6){
			String temp = s.replaceAll("[0-9]","");
			return temp.equals("");
		} else {
			return false;
		}
	}
}
