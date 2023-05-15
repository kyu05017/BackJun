package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 109단게
 * @Ttitle :배열의 원소 삭제하기
 */

public class Step109 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12}))
		);
	}
	public static int[] solution(int[] arr, int[] delete_list) {

		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < arr.length; i++){
			int task = 0;
			for(int j = 0; j < delete_list.length; j++){
				if(arr[i] != delete_list[j]){
					task++;
				}
			}
			if(task == delete_list.length){
				list.add(arr[i]);
			}
			task = 0;
		}
		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = list.get(i);
		}
		//IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
		return answer;
	}
}


