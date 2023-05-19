package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 162단게
 * @Ttitle : 유한소수 판별하기
 */

public class Step162 {
	public static void main(String[] args) {

		System.out.println(
			(solution(7,20))
		);
	}
	public static int solution(int a, int b) {
		int answer =b/reUclid(a,b);
		while(answer != 1){
			if(answer % 2 == 0){
				answer /= 2;
			} else if(answer %5 == 0){
				answer /= 5;
			} else {
				return 2;
			}
		}
		return 1;
	}

	private static int reUclid(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return reUclid(b, a % b);
		}
	}
}


