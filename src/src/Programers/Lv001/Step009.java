package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 9단게
 * @Ttitle : 홀짝구분하기
 */

import java.util.Scanner;

public class Step009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n%2==0){
			System.out.println(n+" is even");
		} else {
			System.out.println(n+" is odd");
		}
	}
}
