package Programers.Lv001;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 5단게
 * @Ttitle : 자연수 뒤집어 배열로 만들기
 */


public class Setp008 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}

	public static int[] solution(long n) {
		char[] temp = String.valueOf(n).toCharArray();
		int[] answer = new int[temp.length];
		int tmp = 0;
		for(int i = temp.length - 1; i >= 0; i--){
			answer[tmp] = (temp[i]-'0');
			tmp++;
		}
		return answer;
	}
}
