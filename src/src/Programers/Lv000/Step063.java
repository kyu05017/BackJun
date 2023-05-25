package Programers.Lv000;


import java.util.Arrays;
/**
 * @Author: kyu05017
 * @Date: 2023/05/13
 * @Description: 프로그래머스 Lv01 63단게
 * @Ttitle : n 번째 원소부터
 *
 */

public class Step063 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 2)));
	}
	public static int[] solution(int[] num_list, int n) {
		return Arrays.copyOfRange(num_list ,n-1, num_list.length );
	}

}

