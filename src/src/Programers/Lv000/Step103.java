package Programers.Lv000;

import java.util.*;
/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 103단게
 * @Ttitle :전국 대회 선발 고사
 */

public class Step103 {
	public static void main(String[] args) {

		System.out.println(
				solution(new int[]{3, 7, 2, 5, 4, 6, 1} , new boolean[]{false, true, true, true, true, false, false})
		);
	}
	public static int solution(int[] rank, boolean[] attendance) {
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i< rank.length; i++){
			if(attendance[i]) {
				list.add(rank[i]);
			}
		}
		int[] task = new int [list.size()];
		for(int i = 0; i<task.length; i++){
			task[i] = list.get(i);
		}
		Arrays.sort(task);
		list = new ArrayList<Integer>();
		for(int i = 0; i<task.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (task[i] == rank[j]) {
					list.add(j);
				}
			}
		}
		return 10000*list.get(0)+100*list.get(1)+list.get(2) ;
	}
}


