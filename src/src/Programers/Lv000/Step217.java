package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/25
 * @Description: 프로그래머스 Lv01 217단게
 * @Ttitle : 배열 두배 만들기
 */

public class Step217 {
	public static void main(String[] args) {
		System.out.println(
				(solution(new int[]{1, 2, 3, 4, 5}))
		);
	}

	public static int[] solution(int[] a ) {
		for(int i=0;i<a.length;i++){
			a[i]=a[i]*2;
		}
		return a;
	}
} 