package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 208단게
 * @Ttitle : 옷가게 할인 받기
 */

public class Step208 {
	public static void main(String[] args) {
		System.out.println(
				(solution(100010))
		);
	}

	public static int solution(int p) {
		int answer = 0;
		int temp = 0;
		if(p >= 100000 && p < 300000){
			temp = (int) Math.round(p*0.05);
			answer = p - temp;
		} else if(p >= 300000&&p < 500000) {
			temp = (int) Math.round(p*0.1);
			answer = p - temp;
		} else if(p >= 500000){
			temp = (int) Math.round(p*0.2);
			answer = p - temp;
		} else {
			answer = p;
		}
		return answer;
	}
} 