package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 173단게
 * @Ttitle : 직사각형 넓이 구하기
 */

public class Step173 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[][]{{1,1},{2, 1},{2,2},{1,2}}))
		);
	}

	public static int solution(int[][] d) {
		int x = 0;
		if(d[0][0] == d[2][0]){
			if(d[0][1] < 0){
				x = d[2][1] - d[0][1];
			} else {
				x = d[0][1] - d[2][1];
			}
		} else if(d[0][1] == d[2][1]){
			if(d[2][0] < 0){
				x = d[0][0] - d[2][0];
			} else {
				x = d[2][0] - d[0][0];
			}
		}
		int y = 0;
		if(d[1][0] == d[3][0]){
			if(d[1][0]  < 0){
				y = d[3][1] - d[1][1];
			} else {
				y = d[1][1] - d[3][1];
			}

		} else if(d[1][1] == d[3][1]){
			if(d[3][0] < 0){
				y = d[1][0] - d[3][0];
			} else{
				y = d[3][0] - d[1][0];
			}
		}
		int answer = Math.abs(x*y);
		return x*y;
	}
}