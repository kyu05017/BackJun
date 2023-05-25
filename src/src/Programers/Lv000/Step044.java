package Programers.Lv000;


/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 44단게
 * @Ttitle : 부분 문자열 이어 붙여 문자열 만들기
 *
 */

public class Step044 {

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"} , new int[][]{{0,4},{1,2},{3,5},{7,7}}));
	}
	public static String solution(String[] my_strings, int[][] parts) {
		String answer = "";

		for(int i = 0; i < my_strings.length; i++) {
			String temp = my_strings[i].substring(parts[i][0] , parts[i][1]+1);
			answer += temp;
		}
		return answer;
	}
}

