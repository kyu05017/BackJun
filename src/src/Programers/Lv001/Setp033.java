package Programers.Lv001;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 33단게
 * @Ttitle :같은 숫자는 싫어
 */

public class Setp033 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(new int[]{1,1,3,3,0,1,1})
				)
		);
	}

	public static int[] solution(int []arr) {
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		int i = 1;
		int j = 0;
		while(true){
			if(list.get(j) != arr[i]){
				list.add(arr[i]);
				i++;
				j++;
			} else {
				i++;
			}

			if(i== arr.length){
				break;
			}
		}
		int[] answer = new int[list.size()];
		for(int k = 0; k< answer.length; k++){
			answer[k] = list.get(k);
		}
		return answer;
	}
}
