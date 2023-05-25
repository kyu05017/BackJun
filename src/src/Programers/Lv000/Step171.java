package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 171단게
 * @Ttitle : 최댓값 만들기 (2)
 */

public class Step171 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 2, -3, 4, -5}))
		);
	}

	public static int solution(int[] n) {
		int m = Integer.MAX_VALUE * -1;
		for(int i=0; i<n.length; i++) {
			for(int j=i; j<n.length; j++) {
				if(m < n[i] * n[j] && i!=j) {
					m = n[i] * n[j];
				}
			}
		}

		return m;
	}
}