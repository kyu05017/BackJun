package Programers.Lv001;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 9단게
 * @Ttitle :정수 제곱근 판별
 */


public class Setp009 {
	public static void main(String[] args) {
		System.out.println((solution(121)));
	}

	public static long solution(long n) {
		long answer = 0;
		long temp = (long)Math.sqrt(n);
		if(n==temp*temp){
			answer = (temp+1)*(temp+1);
		}else{
			answer = -1;
		}
		return answer;
	}
}
