package Programers.Lv000;


import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 60단게
 * @Ttitle : 배열 만들기 3
 *
 */

public class Step060 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1,3},{0,4}}));
	}
	public static int[] solution(int[] arr, int[][] intervals) {
		int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < intervals.length; i++) {
			for(int k = intervals[i][0]; k <= intervals[i][1]; k++) {
				list.add(arr[k]);
			}
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size();i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}

