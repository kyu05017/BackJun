package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 155단게
 * @Ttitle : k의 개수
 */

public class Step155 {
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


