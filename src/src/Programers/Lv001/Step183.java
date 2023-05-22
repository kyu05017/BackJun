package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 183단게
 * @Ttitle :주사위 개수
 */

import java.util.ArrayList;
import java.util.List;

public class Step183 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1,1,1},1))
		);
	}

	public static int solution(int[] a, int n)  {
		int x=a[0]/n;
		int y=a[1]/n;
		int z=a[2]/n;
		return x*y*z;
	}
} 