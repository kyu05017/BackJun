package Programers.Lv001;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 97단게
 * @Ttitle :무작위로 K개의 수 뽑기
 */

public class Step097 {
	public static void main(String[] args) {
		solution(new int[]{0, 1, 1, 2, 2, 3} , 3);
	}
	public static int[] solution(int[] arr, int k) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(list.size()==0){
				list.add(arr[i]);
			}else{
				if(list.indexOf(arr[i])==-1){
					list.add(arr[i]);
				}
			}
		}
		if(list.size()<k){
			for(int i=list.size();i<k;i++){
				list.add(-1);
			}
		}else if (list.size() >k){
			for(int i=list.size()-1;i>=k;i--){
				list.remove(i);
			}
		}
		answer = new int[list.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=list.get(i);
		}
		return answer;
	}
}


