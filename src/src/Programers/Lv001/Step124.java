package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 124단게
 * @Ttitle :이차원 배열 대각선 순회하기
 */
import java.util.*;
public class Step124 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[][]{{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}},2))
		);
	}
	public static int solution(int[][] board, int k) {
		List<Integer> list = new  ArrayList<Integer>();

		for(int i = 0;i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++){
				if((i+j) <= k) {
					list.add(board[i][j]);
				}
			}
		}
		int answer = 0;
		for(Integer temp : list){
			answer += temp;
		}
		return answer;
	}
}


