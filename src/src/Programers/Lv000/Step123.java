package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 123단게
 * @Ttitle :정사각형으로 만들기
 */

public class Step123 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999},{33, 95, 999}}))
		);
	}
	public static int[][] solution(int[][] arr) {

		int x = arr.length;
		int y = arr[0].length;
		int[][] answer = {};
		if(x > y){
			answer = new int[x][x];
			for(int i = 0; i<arr.length;i++){
				for(int j = 0; j<arr[i].length;j++){
					answer[i][j] = arr[i][j];
				}
			}
		} else {
			answer = new int[y][y];
			for(int i = 0; i<arr.length;i++){
				for(int j = 0; j<arr[i].length;j++){
					answer[i][j] = arr[i][j];
				}
			}
		}


		return answer;
	}
}


