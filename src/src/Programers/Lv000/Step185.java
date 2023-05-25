package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 185단게
 * @Ttitle :공 던지기
 */

public class Step185 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{4, 455, 6, 4, -1, 45, 6},2))
		);
	}

	public static int solution(int[] a, int b) {
		int re = 0;
		int tb=0;
		while(tb <b-1){
			re+=2;
			if(re > a.length){
				re=re-a.length;
			}
			tb++;
		}
		return a[re];
	}
} 