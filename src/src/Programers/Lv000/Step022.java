package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/30
 * @Description: 프로그래머스 Lv01 22단게
 * @Ttitle : 등차수열의 특정한 항만 더하기
 *
 * 등차 수열 공식 a_{n}=a_{1}+(n-1)d
 */

public class Step022 {
	public static void main(String[] args) {
		//System.out.println(solution(7	,1	, new boolean[]{false, false, false, true, false, false, false}));
		System.out.println(solution(3,	4	,new boolean[]{true, false, false, true, true}));
	}

	public static int solution(int a, int d, boolean[] included) {
		int x = 0;

		for (int i = 0; i < included.length; i++) {

			if(included[i]) {
				x += a + ((i) * d);
			}
		}

		return x;
	}
}

