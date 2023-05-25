package Programers.Lv000;


import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 62단게
 * @Ttitle : 배열 만들기 3
 *
 */

public class Step062 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{0, 1, 2, 3, 4, 5} , new int[]{4, 1, 2}));
	}
	public static int[] solution(int[] arr, int[] query) {
		for(int i = 0; i < query.length; i++) {
			if( i%2 == 0) {
				Arrays.copyOfRange(arr, 0 , query[i]+1);
			} else {
				Arrays.copyOfRange(arr,query[i],arr.length);
			}
		}
		return arr;
	}
}

