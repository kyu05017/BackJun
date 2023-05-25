package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 102단게
 * @Ttitle :뒤에서 5등까지
 */

public class Step102 {
	public static void main(String[] args) {
		solution(new int[]{0, 1, 1, 2, 2, 3} );
	}
	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = new int[5];
		for(int i=0;i<answer.length;i++){
			answer[i]=num_list[i];
		}
		return answer;
	}
}


