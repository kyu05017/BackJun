package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 174단게
 * @Ttitle : 배열 원소의 길이
 */

public class Step174 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new String[] {"We", "are", "the", "world!"}))
		);
	}

	public static int[] solution(String[] str) {
		int[] answer = new int[str.length];
		int i =0;
		for(String temp : str){
			answer[i] = temp.length();
			i++;
		}
		return answer;
	}
}