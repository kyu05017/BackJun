package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/13
 * @Description: 프로그래머스 Lv01 64단게
 * @Ttitle : 순서 바꾸기
 */

import java.util.*;

public class Step064 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 3)));
	}
	public static Integer[] solution(int[] num_list, int n) {
		List<Integer> beNum = new ArrayList<>();
		List<Integer> afNum = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			beNum.add(num_list[i]);
		}

		for(int i = n; i < num_list.length; i++){
			afNum.add(num_list[i]);
		}
		afNum.addAll(beNum);
		Integer[] answer = afNum.toArray(new Integer[0]);
		return answer;
	}
}

