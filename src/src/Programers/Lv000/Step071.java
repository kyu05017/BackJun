package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 71단게
 * @Ttitle :수열과 구간 쿼리 1
 */

public class Step071 {
	public static void main(String[] args) {
		System.out.println(
				(
						Arrays.toString(solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}}))
				)
		);
	}
	public static int[] solution(int[] arr, int[][] queries) {
		for(int i = 0; i < queries.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(queries[i][0] <= j && j <= queries[i][1]){
					arr[j] = arr[j]+1;
				}
			}
		}
		return arr;
	}
}

