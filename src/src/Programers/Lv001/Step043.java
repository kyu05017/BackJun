package Programers.Lv001;


import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 43단게
 * @Ttitle : 배열만들기 5
 *
 */

public class Step043 {

	public static void main(String[] args) {
		solution(new String[] {"0123456789","9876543210","9999999999999"} , 50000 , 5 , 5);
	}
	public static int[] solution(String[] intStrs, int k, int s, int l) {
		ArrayList<Integer> list = new ArrayList<>();

		for(int i=0; i<intStrs.length;i++){
			String task= intStrs[i].substring(s,s+l);
			int chTask = Integer.parseInt(task);
			if(chTask>k){
				list.add(chTask);
			}
		}
		int[] answer = new int[list.size()];

		for(int i=0;i<answer.length;i++){
			answer[i]=list.get(i);
		}

		return answer;
	}
}

