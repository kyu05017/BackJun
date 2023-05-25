package Programers.Lv000;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/07
 * @Description: 프로그래머스 Lv01 35단게
 * @Ttitle : 콜라츠 수열 만들기
 */

public class Step035 {

	public static void main(String[] args) {
		solution(10);
	}
	public static int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		list.add(n);
		boolean flag = true;
		while(flag) {
			if(n%2==0){
				n = n/2;
				list.add(n);
			} else {
				n = 3*n+1;
				list.add(n);
			}
			if(n == 1){
				flag = false;
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}

