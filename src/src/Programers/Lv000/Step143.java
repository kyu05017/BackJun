package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/17
 * @Description: 프로그래머스 Lv01 143단게
 * @Ttitle : 가장 큰 수 찾기
 */

public class Step143 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 8, 3}))
		);
	}
	public static int[] solution(int[] a) {
		int[] ar = new int[2];
		int m= a[0],ix=0;
		for(int i=0;i<a.length;i++){
			if(m<a[i]){
				m=a[i];
				ix=i;
			}
		}
		ar[0]=m;
		ar[1]=ix;
		return ar;
	}
}


