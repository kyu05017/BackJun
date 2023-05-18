package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/18
 * @Description: 프로그래머스 Lv01 152단게
 * @Ttitle : 가까운 수
 */

public class Step152 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{3, 10, 28} , 20))
		);
	}
	public static int solution(int[] a, int n) {
		int answer = 0;
		if(a.length==1){
			return a[0];
		}
		Arrays.sort(a);
		int[] t = new int[a.length];
		for(int i=0;i<a.length;i++){
			t[i]=n-a[i];
		}
		int min = t[0];
		for(int i=0;i<t.length;i++){
			if(min >Math.abs(t[i])){
				min=Math.abs(t[i]);
			}
		}
		for(int i=0;i<a.length;i++){
			if(min==Math.abs(n-a[i])){
				return a[i];
			}
		}
		return answer;
	}
}


