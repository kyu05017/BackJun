package Programers.Lv000;

/**
 * @Author: kyu05017
 * @Date: 2023/04/25
 * @Description: 프로그래머스 Lv01 4단게
 * @Ttitle : 대소문자 변경하기
 */
import java.util.Scanner;
public class Step004 {
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
