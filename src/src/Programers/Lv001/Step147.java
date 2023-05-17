package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 147단게
 * @Ttitle : 인덱스 바꾸기
 */

import java.util.ArrayList;
import java.util.List;

public class Step147 {
	public static void main(String[] args) {

		System.out.println(
				(solution(24))
		);
	}
	public static int[] solution(int n) {
		List<Integer> l = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(n%i==0){
				l.add(i);
			}
		}
		int[] answer = new int[l.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=l.get(i);
		}
		return answer;
	}
}


