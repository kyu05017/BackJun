package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 30단게
 * @Ttitle :행렬의 덧셈
 */

public class Setp030 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(new int[][]{{1,2},{2,3}},new int[][]{{3,4},{5,6}})
				)
		);
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < arr1.length; i++) {
			int temp = 0;
			for(int j = 0; j < arr1[0].length; j++) {
				temp = arr1[i][j] +arr2[i][j];
				answer[i][j] =temp;
				temp = 0;
			}
		}
		return answer;
	}
}
