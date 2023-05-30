package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 11단게
 * @Ttitle :문자열을 정수로 바꾸기
 */


public class Setp011 {
	public static void main(String[] args) {
		System.out.println((solution("pPoooyY")));
	}

	public static int solution(String s) {
		int answer = 0;
		if(s.contains(("-"))){
			String temp = s.replace("-", "");
			answer = Integer.parseInt(temp)*-1;
		} else {
			answer = Integer.parseInt(s);
		}
		return answer;
	}
}
