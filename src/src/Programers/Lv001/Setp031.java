package Programers.Lv001;

import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 31단게
 * @Ttitle :직사각형 별찍기
 */

public class Setp031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b=sc.nextInt();

		for(int i= 0; i < b; i++) {
			for(int j =0; j < a; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
