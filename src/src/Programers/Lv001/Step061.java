package Programers.Lv001;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 61단게
 * @Ttitle : 배열 만들기 3
 *
 */

public class Step061 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 1, 1}));
	}
	public static int[] solution(int[] arr) {
		int firTask = 0;
		int lastTask= 0;
		int[] answer = {};
		for(int i = 0 ; i < arr.length; i++){
			if(arr[i] == 2) {
				firTask = i;
				break;
			}
		}
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] == 2) {
				lastTask = i;
				break;
			}
		}
		if(firTask == 0 && lastTask == 0){
			answer = new int[1];
			answer[0] = -1;
		} else {
			List<Integer> list = new ArrayList<>();
			for(int i = firTask; i <= lastTask; i++) {
				list.add(arr[i]);
			}
			answer = new int[list.size()];
			for(int i = 0; i < list.size(); i++){
				answer[i] = list.get(i);
			}
		}

		return answer;
	}
}

