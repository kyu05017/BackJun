package Programers.Lv001;

import java.util.Arrays;

/**
 * @Author: kyu05017
 * @Date: 2023/06/03
 * @Description: 프로그래머스 Lv1 38단계
 * @Ttitle : 시저암호
 */

public class Setp038 {
	public static void main(String[] args) {
		System.out.println(
				(
						solution("a B z Z",4)
				)
		);
	}

	public static String solution(String s, int n) {
		String answer = "";
		char[] temp = s.toCharArray();
		for(int i=0; i<temp.length; i++) {
			if(!String.valueOf(temp[i]).equals(" ")){
				int tmp = temp[i];
				int other = 0;
				if(tmp >= 97){
					tmp = tmp+n;
					if(tmp > 122){
						other = tmp - 123;
						tmp = 97 + other;
						if(tmp > 122){
							other = tmp - 123;
							tmp = 97 + other;
						}
						answer += (char)tmp;
					}else{
						answer += (char)tmp;
					}
				}else if(tmp >=65 && tmp <=90){
					tmp = tmp+n;
					if(tmp > 90){
						other = tmp - 91;
						tmp = 65 + other;
						if(tmp > 90){
							other = tmp - 91;
							tmp = 65 + other;
						}
						answer += (char)tmp;
					} else {
						answer += (char)tmp;
					}
				}
			} else {
				answer += temp[i];
			}
		}
		return answer;
	}
}
