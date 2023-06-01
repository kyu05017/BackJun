package Programers.Lv001;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 34단게
 * @Ttitle :같은 숫자는 싫어
 */

public class Setp034 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(45)
				)
		);
	}

	public static int solution(int n) {

		String num3 = Integer.toString(n,3);
		char[] tmp = num3.toCharArray();
		String getnum = "";
		for(int i=tmp.length-1; i>=0; i--) {
			getnum += tmp[i];
		}
		return Integer.parseInt(getnum,3);
	}
}
