package Programers.Lv001;

import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 32단게
 * @Ttitle :직사각형 별찍기
 */

public class Setp032 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(3,12)
				)
		);
	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = dct(n,m);
		answer[1] = n*m/dct(n,m);
		return answer;
	}

	public static int dct(int a,int b){
		if(a%b==0){
			return b;
		}
		return dct(b,a%b);
	}
}
