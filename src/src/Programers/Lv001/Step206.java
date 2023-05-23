package Programers.Lv001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 206단게
 * @Ttitle : 나이 출력
 */

public class Step206 {
	public static void main(String[] args) {
		System.out.println(
				(solution(23))
		);
	}

	public static int solution(int age) {
		return 2022-age+1;
	}
} 