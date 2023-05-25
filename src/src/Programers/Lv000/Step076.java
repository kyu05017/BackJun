package Programers.Lv000;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/14
 * @Description: 프로그래머스 Lv01 76단게
 * @Ttitle :길이에 따른 연산
 */

public class Step076 {
	public static void main(String[] args) {
		System.out.println(
				(
						(solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}))
				)
		);
	}
	public static int solution(int[] num_list) {
/*
		IntStream in = IntStream.of(num_list);
		return num_list.length>10?in.sum():in.reduce(1,(a,b) -> a*b);


		return
*/

		int answer = 0;
		if(num_list.length >= 11) {
			answer = Arrays.stream(num_list).sum();
			// Arrays.stream(num_list).reduce(0,Integer::sum);
		} else if(num_list.length <= 10) {
			answer = Arrays.stream(num_list).reduce(1, (x,y) -> x * y);
		}
		return answer;
	}
}

