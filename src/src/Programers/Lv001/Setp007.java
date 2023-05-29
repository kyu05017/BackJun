package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 5단게
 * @Ttitle : 나머지가 1이 되는 수 찾기
 */


public class Setp007 {
	public static void main(String[] args) {
		System.out.println((solution(12)));
	}

	public static int solution(int n) {
		int answer = 0;

		for(int i = 2; i <= n ; i++){
			if(n%i==1){
				answer = i;
				break;
			}
		}
		return answer;
	}
}
