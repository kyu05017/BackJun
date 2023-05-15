package Programers.Lv001;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 96단게
 * @Ttitle :배열 만들기 6
 */

public class Step096 {
	public static void main(String[] args) {
		solution(new int[]{0, 1, 1, 1, 0});
	}
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(list.size()==0){
				list.add(arr[i]);
			}else{
				if(list.get(list.size()-1)==arr[i]){
					list.remove(list.size()-1);
				}else{
					list.add(arr[i]);
				}
			}
		}
		int[] answer = {};
		if(list.size()==0){
			answer = new int[]{-1};
		} else {
			answer = new int[list.size()];
			for(int i=0;i<answer.length;i++){
				answer[i]=list.get(i);
			}
		}
		return answer;
	}
}


