package Programers.Lv001;



/**
 * @Author: kyu05017
 * @Date: 2023/05/09
 * @Description: 프로그래머스 Lv01 41단게
 * @Ttitle : 문자열 여러 번 뒤집기
 *
 */

public class Step041 {

	public static void main(String[] args) {

		System.out.println(solution("rermgorpsam",new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
	}
	public static String solution(String my_string, int[][] queries) {
		String answer = "";

		for(int i = 0; i < queries.length; i++) {
			for(int j = queries[i][1]; j < 0; i--){

			}
		}
		return answer;
	}
}

