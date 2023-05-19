package Programers.Lv001;

/**
 * @Author: kyu05017
 * @Date: 2023/05/19
 * @Description: 프로그래머스 Lv01 170단게
 * @Ttitle : 다항식 더하기
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step170 {
	public static void main(String[] args) {

		System.out.println(
				(solution("x + x + x"))
		);
	}

	public static String solution(String p) {
		String[] temp = p.split(" +");
		List<String> tmp = new ArrayList<String>();
		for(String tp : temp) {
			if(!tp.contains("+")){
				tmp.add(tp);
			}
		}
		int num = 0;
		int numX = 0;
		for(String tp : tmp){
			if(tp.contains("x")){
				if(tp.equals("x")){
					numX ++;
				}else {
					String g = tp.replace("x","");
					int x = Integer.parseInt(g);
					numX +=x;
				}
			} else {
				num += Integer.parseInt(tp);
			}
		}
		String answer = "";
		if(num == 0){ //
			if(numX == 1){
				answer = "x";
			} else {
				answer = numX+"x";
			}
		} else if(numX == 0){
			answer = String.valueOf(num);
		} else {
			if(numX==1){
				answer = "x + "+num;
			} else {
				answer = numX+"x + "+num;
			}
		}

		return answer;
	}
}