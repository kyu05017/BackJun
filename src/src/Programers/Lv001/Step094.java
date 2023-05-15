package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 94단게
 * @Ttitle :배열의 원소만큼 추가하기
 */

public class Step094 {
	public static void main(String[] args) {
		solution(new int[]{5, 1, 4});
	}
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();

		for(int i=0;i<arr.length;i++){
			for(int j = 0; j < arr[i];j++){
				list.add(arr[i]);
			}
		}
		int[] answer = new int[list.size()];
		for(int k =0; k < answer.length;k++){
			answer[k] = list.get(k);
		}
		return answer;
	}
}


