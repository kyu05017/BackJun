package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 11단게
 * @Ttitle : 문자열 섞기
 */

import java.util.Arrays;
import java.util.Scanner;

public class Step011 {
	public static void main(String[] args) {
		solution("aaaaa","bbbbb");
	}

	public static String solution(String str1, String str2) {
		String answer = "";
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		char[] arr = new char[arr1.length + arr2.length];
		int j = 0;
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i%2==0){
				arr[i] = arr1[j];
				j++;
			} else {
				arr[i] = arr2[k];
				k++;
			}
		}
		answer = String.valueOf(arr);
		return answer;
	}
}

