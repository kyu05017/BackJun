package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 20단게
 * @Ttitle :음양 더하기
 */

public class Setp020 {
	public static void main(String[] args) {
		System.out.println((solution(new int[]{4,7,12},new boolean[]{true,false,true})));
	}

	public static int solution(int[] a, boolean[] b) {
		int answer = 0;
		for(int i=0;i<a.length;i++){
			if(b[i]){
				answer += a[i];
			}else{
				answer +=(a[i]*-1);
			}
		}
		return answer;
	}
}
