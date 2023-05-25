package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 187단게
 * @Ttitle : 점의 위치 구하기
 */

public class Step187 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1,2}))
		);
	}

	public static int solution(int[] a) {
		int x = a[0], y = a[1];
		int answer = 0;
		if(x > 0 && y > 0){
			answer = 1;
		} else if(x < 0 && y > 0){
			answer = 2;
		} else if(x < 0 && y < 0){
			answer = 3;
		} else {
			answer = 4;
		}
		return answer;
	}
} 