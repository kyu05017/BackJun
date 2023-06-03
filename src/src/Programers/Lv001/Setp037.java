package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/06/03
 * @Description: 프로그래머스 Lv1 37단게
 * @Ttitle : 세명이 오리라
 */

public class Setp037 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(new int[]{-2, 3, 0, 2, -5})
				)
		);
	}

	public static int solution(int[] number) {
		int answer = 0;


		for(int i = 0; i < number.length; i++){
			for(int j = i+1; j < number.length;j++){
				for(int k = j+1; k < number.length;k++){
					if(number[i] + number[j] + number[k] == 0){
						answer ++;
					}
				}
			}
		}

		return answer;
	}
}
