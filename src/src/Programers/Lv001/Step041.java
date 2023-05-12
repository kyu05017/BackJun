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
		String temp = my_string;

		for(int i = 0;i < queries.length; i++) {
			String start = temp.substring(0,queries[i][0]);
			String end = temp.substring(queries[i][1]+1,my_string.length());
			String mid = temp.substring(queries[i][0],queries[i][1]+1);
			char[] midchar = mid.toCharArray();
			mid="";
			for(int j=midchar.length-1;j>=0;j--){
				mid+=midchar[j];
			}
			temp = start+mid+end;
		}
		answer =temp;
		return answer;
	}
}

