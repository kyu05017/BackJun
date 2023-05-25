package Programers.Lv000;


/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 56단게
 * @Ttitle : 카운트 다운
 *
 */

public class Step056 {

	public static void main(String[] args) {
		System.out.println(solution(10,3));
	}
	public static int[] solution(int start, int end) {
		int[] answer = new int [start - end + 1];
		int task = 0;
		for(int i = start; i >= end; i--){
			answer[task] = i;
			task++;
		}

		return answer;
	}
}

