package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 139단게
 * @Ttitle : n의 배수 고르기
 */
import java.util.*;
public class Step139 {
	public static void main(String[] args) {

		System.out.println(
				(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}))
		);
	}
	public static int[] solution(int n, int[] numlist) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<numlist.length;i++){
			if(numlist[i]%n==0){
				list.add(numlist[i]);
			}
		}

		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=list.get(i);
		}
		return answer;
	}
}


