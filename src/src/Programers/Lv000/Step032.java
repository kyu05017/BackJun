package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/01
 * @Description: 프로그래머스 Lv01 32단게
 * @Ttitle : 수열과 구간 쿼리 4
 */

public class Step032 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{0, 1, 2, 4, 3},new int[][]{{0, 4, 1},{0, 3, 2},{0, 3, 3}}));
	}

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = arr;

		for(int i = 0; i < queries.length; i++) {
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				if(j%queries[i][2] == 0) {
					arr[j] ++;
				}
			}
		}
		return answer;
	}
}

