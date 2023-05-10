package Programers.Lv001;


/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 50단게
 * @Ttitle : 문자열 뒤집기
 *
 */

public class Step050 {

	public static void main(String[] args) {
		System.out.println(solution("Progra21Sremm3",6,12));
	}
	public static String solution(String my_string, int s, int e) {
		String answer = "",temp = "";
		char[] midchar = my_string.substring(s,e+1).toCharArray();
		for(int i = midchar.length-1 ; i >=0; i--) {
			temp += midchar[i];
		}
		return answer = my_string.substring(0,s)+temp+my_string.substring(e+1);
	}
}

