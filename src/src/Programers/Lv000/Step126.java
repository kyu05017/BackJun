package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/16
 * @Description: 프로그래머스 Lv01 126단게
 * @Ttitle : 다음에 올 숫자
 */

public class Step126 {
	public static void main(String[] args) {

		System.out.println(
				(solution(new int[]{1, 2, 3, 4}))
		);
	}
	public static int solution(int[] common) {
		int answer = 0;
		int x=common[0],y=common[1],z=common[2];
		if((y-x)==(z-y)){
			answer=common[common.length-1]+(y-x);
		}else{
			answer=common[common.length-1]*(z/y);
		}
		return answer;
	}
}


