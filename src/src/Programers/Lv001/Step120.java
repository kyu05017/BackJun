package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 120단게
 * @Ttitle :특별한 이차원 배열 1
 */

public class Step120 {
	public static void main(String[] args) {

		System.out.println(
				(solution(3))
		);
	}
	public static int[][] solution(int n) {
		int[][] answer = new int[n][n];
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<answer[i].length;j++){
				if(i==j){
					answer[i][j]=1;
				}
			}
		}
		return answer;
	}
}


