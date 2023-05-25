package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 30단게
 * @Ttitle : 수열과 구간 쿼리 3
 */

public class Step030 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{0, 1, 2, 3, 4},new int[][]{{0, 3},{1, 2},{1, 4}}));
	}
	/*
	* {{0, 3},{1, 2},{1, 4}})
	* 0 {0,3}
	* 1 {1,2}
	* 2 {1,4}
	* */

	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = arr;
		int temp1 = 0;
		int temp2 = 0;
		for(int i = 0; i < queries.length; i++){ // 3회
			temp1 = arr[queries[i][0]];
			temp2 = arr[queries[i][1]];
			for(int j = 0; j < arr.length; j++){ // 5회
				if(j == queries[i][0]){
					arr[j] = temp2;
				} else if(j == queries[i][1]) {
					arr[j] = temp1;
				}
			}
		}
		return answer;
	}
}

