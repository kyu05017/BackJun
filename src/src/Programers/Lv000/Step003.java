package Programers.Lv000;

import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/26
 * @Description: 프로그래머스 레벨 0 3단계
 * @Ttitle : 문자열 반복해서 출력하기
 */
public class Step003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		for(int i = 0; i<n; i++){
			System.out.print(str);
		}
	}
}

