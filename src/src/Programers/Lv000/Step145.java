package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 145단게
 * @Ttitle : 약수구하기
 */
import java.util.*;
public class Step145 {
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


