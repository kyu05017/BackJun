package Programers.Lv001;

import java.util.*;
/**
 * @Author: kyu05017
 * @Date: 2023/05/13
 * @Description: 프로그래머스 Lv01 67단게
 * @Ttitle : n개 간격의 원소들
 */

public class Step067 {
	public static void main(String[] args) {
		System.out.println((Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 2))));
	}
	public static int[] solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < num_list.length; i++) {
			if(i%n==0){
				list.add(num_list[i]);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++){
			answer[i] = list.get(i);
		}
		return answer;
	}
}

