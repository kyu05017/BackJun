package Programers.Lv001;

import java.util.*;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 12단게
 * @Ttitle :정수 내림차순으로 배치하기
 */


public class Setp012 {
	public static void main(String[] args) {
		System.out.println((solution(118372)));
	}

	public static long solution(long n) {
		char[] temp = String.valueOf(n).toCharArray();
		Integer[] list = new Integer[temp.length];
		String tmp = "";
		for(int i=0; i<list.length; i++) {
			list[i] = temp[i]-'0';
		}
		Arrays.sort(list,Collections.reverseOrder());
		for(Integer t : list){
			tmp += t;
		}
		return Long.parseLong(tmp);
	}
}
