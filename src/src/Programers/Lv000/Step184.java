package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 184단게
 * @Ttitle :배열 회전시키기
 */

public class Step184 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{4, 455, 6, 4, -1, 45, 6},"left"))
		);
	}

	public static int[] solution(int[] a, String b) {
		int[] answer = new int[a.length];
		if(b.equals("right")){
			answer[0]=a[a.length-1];
			for(int i =1;i<a.length;i++){
				answer[i]=a[i-1];
			}
		}  else {
			answer[a.length-1]=a[0];
			for(int i=0;i<a.length-1;i++){
				answer[i]=a[i+1];
			}
		}
		return answer;
	}
} 