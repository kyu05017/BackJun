package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 213단게
 * @Ttitle : 짝수는 싫어요
 */
import java.util.*;
public class Step213 {
	public static void main(String[] args) {
		System.out.println(
				(solution(10))
		);
	}

	public static int[] solution(int n) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				list.add(i);
			}
		}
		answer = new int[list.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=list.get(i);
		}
		return answer;
	}
} 