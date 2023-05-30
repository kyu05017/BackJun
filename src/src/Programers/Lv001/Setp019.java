package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 19단게
 * @Ttitle :핸드폰 번호 가리기
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Setp019 {
	public static void main(String[] args) {
		System.out.println((solution("01043456215")));
	}

	public static String solution(String p) {
		String tmp = p.substring(p.length()-4,p.length());
		String temp=p.substring(0,p.length()-4);
		String masking = temp.replaceAll("[0-9]","*");
		String answer = masking+tmp;
		return answer;
	}
}
