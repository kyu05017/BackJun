package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/15
 * @Description: 프로그래머스 Lv01 104단게
 * @Ttitle :정수 부분
 */

public class Step104 {
	public static void main(String[] args) {

		System.out.println(
				solution(1.42)
		);
	}
	public static int solution(double flo) {
		return (int) Math.floor(flo);
	}
}


