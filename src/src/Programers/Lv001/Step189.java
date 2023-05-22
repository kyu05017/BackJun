package Programers.Lv001;

import java.math.BigInteger;

/**
 * @Author: kyu05017
 * @Date: 2023/05/23
 * @Description: 프로그래머스 Lv01 189단게
 * @Ttitle : 가위 바위 보
 */

public class Step189 {
	public static void main(String[] args) {

		System.out.println(
				(solution("2"))
		);
	}

	public static String solution(String rsp) {
		String answer = "";
		char[] tesk = rsp.toCharArray();
		for(int i = 0; i < tesk.length; i++){
			if(String.valueOf((tesk[i])).equals("2")){
				answer += "0";
			} else if(String.valueOf((tesk[i])).equals("5")){
				answer += "2";
			} else if(String.valueOf((tesk[i])).equals("0")){
				answer += "5";
			}
		}
		return answer;
	}
} 