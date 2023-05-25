package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 228단게
 * @Ttitle : 중복된 숫자 개수
 */

public class Step227 {
	public static void main(String[] args) {
		System.out.println(
				(solution(new int[]{149, 180, 192, 170},3))
		);
	}

	public static int solution(int[] a, int n) {
		int answer = 0;
		for(int temp : a){
			if(temp == n){
				answer++;
			}
		}
		return answer;
	}
} 