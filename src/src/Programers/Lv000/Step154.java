package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 154단게
 * @Ttitle : 중복된 문자 제거
 */

public class Step154 {
	public static void main(String[] args) {

		System.out.println(
				(solution("people"))
		);
	}
	public static String solution(String m) {
		char[] t = m.toCharArray();
		String a = "";
		for(int i =0;i<t.length;i++){
			if(a.indexOf(String.valueOf(t[i])) == -1){
				a += String.valueOf(t[i]);
			}
		}
		return a;
	}
}


