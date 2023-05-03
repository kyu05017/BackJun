package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 31단게
 * @Ttitle : 수열과 구간 쿼리 2
 */

public class Step031 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{0, 1, 2, 4, 3},new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}}));
	}

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		Arrays.fill(answer, Integer.MAX_VALUE);

		for(int i = 0; i < queries.length; i++) {
			// 쿼리의 1차 배열만큼 (0,1,2) 총3회 반복
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				// queries[i][0] < i < queries[i][1] 만큼에서
				if(arr[j] > queries[i][2]) {
					// 가장 작은수를 계속 도출
					// 1 회차
					/* {0,4,2}
					* queries[i][2] = 2
					* arr[0] = 0 ,  arr[1] = 1 ,  arr[2] = 2 , arr[3] = 4 , arr[4] = 3
					*
					* arr[j] > queries[i][2] = 4 , 3
					*  Math.min(answer[0] = 2147483647 , arr[3] = 4); == 4
					*
					*  Math.min(answer[0] = 4 , arr[4] = 3); == 3
					*
					*  answer[0] = 3
					* */
					answer[i] = Math.min(answer[i], arr[j]);
				}
			}
			if(answer[i] == Integer.MAX_VALUE) answer[i] = -1;
		}


		return answer;
	}
}

