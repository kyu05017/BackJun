package Programers.Lv001;


/**
 * @Author: kyu05017
 * @Date: 2023/05/10
 * @Description: 프로그래머스 Lv01 55단게
 * @Ttitle : 글자지우기
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step055 {

	public static void main(String[] args) {
		System.out.println(solution("apporoograpemmemprs",new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
	}
	public static String solution(String my_string, int[] indices) {


		String[] arr = my_string.split("");
		for(int i = 0; i < my_string.length(); i++) {
			for(int j = 0; j < indices.length; j++) {
				if(i==indices[j] ){
					arr[i]="";
				}
			}

		}
		String answer = "";
		for(String temp : arr) {
			answer += temp;
		}
		return answer;
	}
}

