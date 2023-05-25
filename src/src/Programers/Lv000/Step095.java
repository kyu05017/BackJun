package Programers.Lv000;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 95단게
 * @Ttitle :빈 배열에 추가, 삭제하기
 */

public class Step095 {
	public static void main(String[] args) {
		solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false});
	}
	public static int[] solution(int[] arr, boolean[] flag) {
		List<Integer> list = new ArrayList<>();
		int temp = 0;
		for(int i = 0; i < flag.length;i++){
			if(flag[i]){
				for(int j = 0; j < arr[i]*2;j++){
					list.add(arr[i]);
				}
				temp = list.size();
			}else {
				for(int j =temp-1; j>= temp-arr[i];j--){
					list.remove(j);
				}
				temp = list.size();
			}
		}
		int[] answer = new int[list.size()];
		for(int k = 0; k < answer.length; k++){
			answer[k] = list.get(k);
		}
		return answer;
	}
}


