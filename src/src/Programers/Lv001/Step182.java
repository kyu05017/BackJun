package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/21
 * @Description: 프로그래머스 Lv01 182단게
 * @Ttitle :합성수 찾기
 */
import java.util.*;
public class Step182 {
	public static void main(String[] args) {

		System.out.println(
				(solution(15))
		);
	}

	public static int solution(int n) {
		int temp = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			if(maker(i)  >=3){
				list.add(i);
			}
		}
		return list.size();
	}
	private static int maker(int n){
		int temp = 0;
		int a = 0;
		for(a=1; a<=n; a++) {
			if ((n % a) == 0) {
				temp++;
			}
		}
		return temp;
	}
} 