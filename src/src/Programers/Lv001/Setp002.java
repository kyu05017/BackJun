package Programers.Lv001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 2단게
 * @Ttitle : 짝수와 홀수
 */


public class Setp002 {
	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	public static String solution(int num) {
		return (num%2!=0) ? "Odd" : "Even";
	}
}
