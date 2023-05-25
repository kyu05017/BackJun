package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 113단게
 * @Ttitle :정수 찾기
 */

public class Step113 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 2, 3, 4, 5},3))
		);
	}
	public static int solution(int[] num_list, int n) {
		int answer = 0;
		for(int temp : num_list) {
			if(temp == n){
				answer = 1;
			}
		}
		//IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
		return answer;
	}
}


