package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 17단게
 * @Ttitle :서울에서 김서방 찾기
 */


public class Setp017 {
	public static void main(String[] args) {
		System.out.println((solution(new String[]{"Jane", "Kim"})));
	}

	public static String solution(String[] s) {
		String answer = "";
		int temp=0;
		for(int i=0;i<s.length;i++){
			if(s[i].equals("Kim")){
				temp=i;

			}
		}
		answer = "김서방은 "+temp+"에 있다";
		return answer;
	}
}
