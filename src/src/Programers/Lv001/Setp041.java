package Programers.Lv001;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kyu05017
 * @Date: 2023/06/04
 * @Description: 프로그래머스 Lv1 41단계
 * @Ttitle : [1차] 비밀지도
 */

public class Setp041 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution(5, new int []{9,20,28,18,11}, new int[]{30,1,21,19,28})
				)
		);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for(int i = 0; i < n; i++){
			char[] tesk1 = String.format("%"+n+"s",Integer.toBinaryString(arr1[i])).replace(" ","0").toCharArray();
			char[] tesk2 = String.format("%"+n+"s",Integer.toBinaryString(arr2[i])).replace(" ","0").toCharArray();
			String temp = "";
			for(int j = 0; j < n; j++){
				if(tesk1[j] == '0' && tesk2[j] == '0'){
					temp += " ";
				} else {
					temp += "#";
				}
			}
			answer[i] =temp;
		}
		return answer;
	}
}
