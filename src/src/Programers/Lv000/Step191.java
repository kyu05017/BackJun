package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 191단게
 * @Ttitle : 개미 군단
 */

public class Step191 {
	public static void main(String[] args) {

		System.out.println(
				(solution(999))
		);
	}

	public static int solution(int hp) {
		System.out.println(hp/5);
		System.out.println(hp%5/3+" = " + hp%5 + " /3 ");
		System.out.println(hp%5/3+" = " + hp%5 + " %3 ");

		return hp/5+hp%5/3+hp%5%3;
	}
} 