package Programers.Lv000;


/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 57단게
 * @Ttitle : 가까운 1 찾기
 *
 */

public class Step057 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 1, 1, 1, 0},3));
	}
	public static int solution(int[] arr, int idx) {
		int answer = 0;
		for(int i = idx; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] == 1) {
				answer = i;
				break;
			} else {
				answer = -1;
			}
		}
		return answer;
	}
}

