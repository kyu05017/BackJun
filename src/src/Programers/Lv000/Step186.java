package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 186단게
 * @Ttitle :2차원으로 만들기
 */

public class Step186 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948},3))
		);
	}

	public static int[][] solution(int[] num_list, int n) {
		int[][] answer = new int[num_list.length/n][n];
		int temp = 0;
		for(int i=0; i<answer.length; i++){
			for(int j = 0 ; j < answer[i].length;j++){
				answer[i][j] = num_list[temp];
				temp++;
			}
		}
		return answer;
	}
} 