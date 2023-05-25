package Programers.Lv000;



/**
 * @Author: kyu05017
 * @Date: 2023/05/08
 * @Description: 프로그래머스 Lv01 37단게
 * @Ttitle : 간단한 논리 연산
 */

public class Step037 {

	public static void main(String[] args) {
		solution(false,true,true,true);
	}
	public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = (x1||x2)&&(x3||x4);
		return answer;
	}
}

