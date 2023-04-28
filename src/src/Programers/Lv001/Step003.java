package Programers.Lv001;

import java.util.Scanner;

/**
 * @Author: kyu05017
 * @Date: 2023/04/26
 * @Description: 프로그래머스 레벨 0 3단계
 * @Ttitle : 대소문자 바꾸기
 */
public class Step003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		char[] arr = a.toCharArray();

		for(int i = 0; i < arr.length; i++) {
			if(97<=arr[i] && arr[i]<=122){
				arr[i]=(char)(arr[i]-32);
				continue;
			} else if(65<=arr[i] && arr[i]<=90){
				arr[i]=(char)(arr[i]+32);
				continue;
			}

		}
		System.out.print(arr);
	}
}
