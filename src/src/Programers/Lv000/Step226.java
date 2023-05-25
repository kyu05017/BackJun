package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 226단게
 * @Ttitle : 머쓱이보다 키 큰 사람
 */

public class Step226 {
	public static void main(String[] args) {
		System.out.println(
				(solution(new int[]{149, 180, 192, 170},3))
		);
	}

	public static int solution(int[] a, int n) {
		int answer = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]>n){
				answer++;
			}
		}
		return answer;
	}
} 