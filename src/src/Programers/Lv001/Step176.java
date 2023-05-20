package Programers.Lv001;

import java.util.*;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/20
 * @Description: 프로그래머스 Lv01 176단게
 * @Ttitle : 소인수분해
 */

public class Step176 {
	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(solution(420))
		);
	}

	public static int[] solution(int n) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 2; i <= n; i++) {
			while (n%i == 0){
				if(!l.contains(i)){
					l.add(i);
				}
				n = n/i;
			}
		}
		int[] answer = new int[l.size()];
		for(int i = 0; i< answer.length;i++){
			answer[i] = l.get(i);
		}
		return answer;
	}
}