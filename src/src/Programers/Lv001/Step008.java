package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 8단게
 * @Ttitle : 문자열 돌리기
 */

import java.util.Scanner;

public class Step008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] arr = a.toCharArray();

		for(int i = 0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
