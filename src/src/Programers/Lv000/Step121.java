package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 121단게
 * @Ttitle :정수를 나선형으로 배치하기
 */

public class Step121 {
	public static void main(String[] args) {

		System.out.println(
				(solution(3))
		);
	}
	public static int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int i=0,j=0,a=2;
		answer[0][0]=1;
		while( a <=(n*n) ){
			while( j+1<n&&answer[i][j+1]==0){
				j++;
				answer[i][j]=a;
				a++;
			}
			while( i+1<n&&answer[i+1][j]==0){
				i++;
				answer[i][j]=a;
				a++;
			}
			while( j-1>=0&&answer[i][j-1]==0){
				j--;
				answer[i][j]=a;
				a++;
			}
			while( i-1>=0&&answer[i-1][j]==0){
				i--;
				answer[i][j]=a;
				a++;
			}
		}
		return answer;
	}
}


