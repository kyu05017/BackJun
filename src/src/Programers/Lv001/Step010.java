package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/04/29
 * @Description: 프로그래머스 Lv01 10단게
 * @Ttitle : 문자열 겹쳐쓰기
 */

import java.util.Scanner;

public class Step010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String overwrite_string = sc.nextLine();
        int s = sc.nextInt();
        sc.close();
        System.out.println(solution(my_string, overwrite_string, s));
	}

	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		String first = my_string.substring(0, s);
		String end = my_string.substring(s+overwrite_string.length());
		answer = first + overwrite_string + end;
		return answer;
	}
}

