package Programers.Lv001;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: kyu05017
 * @Date: 2023/05/30
 * @Description: 프로그래머스 Lv1 13단게
 * @Ttitle :하샤드 수
 */


public class Setp013 {
	public static void main(String[] args) {
		System.out.println((solution(118372)));
	}

	public static boolean solution(int x) {
		boolean answer = false;
		int tmp = 0;
		char[] temp = String.valueOf(x).toCharArray();
		for(int i=0;i<temp.length;i++){
			tmp += temp[i]-'0';
		}
		if(x%tmp==0){
			answer=true;
		}
		return answer;
	}
}
