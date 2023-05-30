package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 23단게
 * @Ttitle :가운데 글자 가져오기
 */

public class Setp023 {
	public static void main(String[] args) {
		System.out.println((solution("abcde")));
	}

	public static String solution(String s) {
		String answer = "";
		char[] temp = s.toCharArray();
		if(s.length()%2!=0){
			answer += temp[s.length()/2];
		}else{
			answer+=temp[(s.length()/2)-1];
			answer+=temp[s.length()/2];
		}
		return answer;
	}
}
