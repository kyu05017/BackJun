package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 210단게
 * @Ttitle : 피자 나눠 먹기 (3)
 */

public class Step210 {
	public static void main(String[] args) {
		System.out.println(
				(solution(4,12))
		);
	}

	public static int solution(int slice, int n) {
		int answer = 1;
		int i = 1;
		while(true){
			answer = slice *i;
			i++;
			if(answer  >= n){
				break;
			}
		}
		return i-1;
	}
} 