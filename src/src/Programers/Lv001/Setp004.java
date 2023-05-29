package Programers.Lv001;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 4단게
 * @Ttitle : 약수의 합
 */


public class Setp004 {
	public static void main(String[] args) {
		System.out.println(solution(12));
	}

	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				answer += (i);
			}
		}
		return answer;
	}
}
